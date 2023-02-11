package workshop14.connection;

import java.sql.*;

public class ConnectionPool implements ConnectionAdapter {
    private static ConnectionPool instance;
    private final String DRIVER;
    private final String URL;
    private final String ID;
    private final String PASSWORD;

    private ConnectionPool() {
        this.DRIVER = "oracle.jdbc.driver.OracleDriver";
        this.URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        this.ID = "academy";
        this.PASSWORD = "pass";
    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }

        return instance;
    }

    public Connection getConnection() {

        Connection connection;

        try {
            Class.forName(this.DRIVER);
            connection = DriverManager.getConnection(this.URL, this.ID, this.PASSWORD);
            connection.setAutoCommit(false);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static boolean isConnection(Connection conn) {
        boolean valid = true;

        try {
            if (conn == null || conn.isClosed()) {
                valid = false;
            }
        } catch (SQLException e) {
            valid = true;
        }

        return valid;
    }

    public static void commit(Connection conn) {
        if (isConnection(conn)) {
            try {
                conn.commit();
            } catch (SQLException e) {
            }
        }
    }

    public static void rollback(Connection conn) {
        if (isConnection(conn)) {
            try {
                conn.rollback();
            } catch (SQLException e) {
            }
        }
    }

}