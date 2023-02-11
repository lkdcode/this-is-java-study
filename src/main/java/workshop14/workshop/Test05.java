package workshop14.workshop;

import workshop14.connection.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test05 {
    public static void main(String[] args) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        PreparedStatement pstmt = null;
        int n = 0;

        String sql = "DELETE FROM DISCARDED_PRODUCT";

        try {
            pstmt = connection.prepareStatement(sql);
            n = pstmt.executeUpdate();

            if (n > 0) {
                System.out.println(n + "개의 데이터가 정상적으로 DELETE 되었습니다.");
                ConnectionPool.commit(connection);
            }

            if (n == 0) {
                System.out.println("데이터가 DELETE 되지 않았습니다.");
            }

        } catch (SQLException e) {
            System.out.println("데이터가 DELETE 되지 않았습니다.");
            ConnectionPool.rollback(connection);
            throw new RuntimeException(e);
        } finally {
            ConnectionPool.close(connection);
            ConnectionPool.close(pstmt);
        }

    }
}