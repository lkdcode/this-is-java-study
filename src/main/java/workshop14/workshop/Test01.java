package workshop14.workshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static workshop14.Pool.*;

public class Test01 {
    /**
     * 제품이 생산된 공장 위치가 "Seoul" 인 제품 중 판매점에 재고가 없는 상품을 출력한다.
     * 조건 : 1) 재고가 없는 조건은 재고 수량이 0이거나 null을 의미한다.
     * 2) null인 경우 "0" 표시 한다.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("제품카테고리\t\t제품명\t\t공장명\t\t\t\t판매점명\t\t판매점재고수량");
        System.out.println("----------+------------+------------------+--------------+--------------");

        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select PDNAME, PDSUBNAME, FACNAME, STONAME, nvl(STAMOUNT, 0)\"STAMOUNT\"\n" +
                "from PRODUCT\n" +
                "join FACTORY using(FACTNO)\n" +
                "join STORE using(PDNO)\n" +
                "where FACNAME='SEOUL FACTORY' and (STAMOUNT is null or STAMOUNT = 0)\n" +
                "order by PDNAME";

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getString("PDNAME") + "\t\t\t");
                System.out.print(rs.getString("PDSUBNAME") + "\t\t");
                System.out.print(rs.getString("FACNAME") + "\t\t");
                System.out.print(rs.getString("STONAME") + "\t\t\t");
                System.out.println(rs.getInt("STAMOUNT"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(conn);
            close(pstmt);
            close(rs);
        }
    }
}
