package workshop14.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 데이터 베이스와 자바를 연동하는 비즈니스 로직
 */
public class FactoryDAO {

    public void getFactoryAll(Connection connection) {
        // 모든 공장 정보를 조회하고 출력한다.

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM factory ORDER BY FACTNO";

        try {
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            System.out.println("공장번호\t\t\t\t공장명\t\t\t\t공장위치");
            System.out.println("--------------------------------------------------");
            while (rs.next()) {
                System.out.print(rs.getString("FACTNO") + "\t\t\t");
                System.out.print(rs.getString("FACNAME") + "\t\t\t");
                System.out.println(rs.getString("FACLOC"));
            }

        } catch (SQLException e) {
            System.out.println("데이터 조회에 실패하였습니다.");
            throw new RuntimeException(e);
        } finally {
            close(connection);
            close(pstmt);
            close(rs);
        }

    }

    private void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void close(PreparedStatement pstmt) {
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void close(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

