package workshop14.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class Connectable implements ConnectionPool {
    private static Connectable instance;
    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
    private final String ID = "academy";
    private final String PASSWORD = "pass";

    private Connectable() {
    }

    public static Connectable getInstance() {
        if (instance == null) {
            instance = new Connectable();
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

}
