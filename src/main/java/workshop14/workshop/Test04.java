package workshop14.workshop;

import workshop14.connection.Connectable;
import workshop14.connection.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test04 {
    public static void main(String[] args) {
        Connection connection = new Connectable().getConnection();
        PreparedStatement pstmt = null;
        int n = 0;

        String sql = "INSERT INTO DISCARDED_PRODUCT\n" +
                "SELECT PDNO, PDNAME, PDSUBNAME, FACTNO, PDDATE, PDCOST, PDPRICE, PDAMOUNT, to_char(sysdate, 'YYYY-MM-DD')\n" +
                "FROM PRODUCT\n" +
                "JOIN FACTORY USING(FACTNO)\n" +
                "WHERE FACNAME = 'CHANGWON FACTORY'";

        try {
            pstmt = connection.prepareStatement(sql);
            n = pstmt.executeUpdate();

            if (n > 0) {
                System.out.println(n + "개의 데이터가 정상적으로 INSERT 되었습니다.");
                ConnectionPool.commit(connection);
            }

        } catch (SQLException e) {
            n = 0;
            ConnectionPool.rollback(connection);
            System.out.println("데이터 추가를 실패하였습니다.");
        } finally {
            ConnectionPool.close(connection);
            ConnectionPool.close(pstmt);
        }

    }
}
