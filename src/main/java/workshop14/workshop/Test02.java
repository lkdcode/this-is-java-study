package workshop14.workshop;

import workshop14.connection.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test02 {
    /**
     * 제품 카테고리가 "TV"인 제품 중 가장 싼 것보다 비싼 모든 제품과,
     * 제품 카테고리가 "CELLPHONE" 인 제품 중 가장 비싼 제품보다 싼 모든 제품을 출력한다.
     * <p>
     * 조건:
     * 1) UNION을 사용하지 않고 하나의 쿼리 문장으로 작성 한다.
     * 2) 제품 원가를 기준으로 한다.
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("제품명\t\t\t제품원가\t\t\t제품가격");
        System.out.println("----------+-----------------+-------------");


        Connection connection = ConnectionPool.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        String sql = "select PDSUBNAME, PDCOST, PDPRICE\n" +
                "from PRODUCT\n" +
                "where PDCOST > (select min(PDCOST)\n" +
                "                from PRODUCT\n" +
                "                where PDNAME='TV')\n" +
                "and PDCOST < (SELECT max(PDCOST)\n" +
                "                FROM PRODUCT\n" +
                "                WHERE PDNAME='CELLPHONE')\n" +
                "ORDER BY PDCOST, PDSUBNAME";

        try {
            pstmt = connection.prepareStatement(sql);
            resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                System.out.print(resultSet.getString("PDSUBNAME") + "\t\t");
                System.out.print(resultSet.getInt("PDCOST") + "\t\t\t");
                System.out.println(resultSet.getInt("PDPRICE"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionPool.close(connection);
            ConnectionPool.close(pstmt);
            ConnectionPool.close(resultSet);
        }

    }
}
