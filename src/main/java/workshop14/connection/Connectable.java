package workshop14.connection;

import java.sql.Connection;

public class Connectable implements ConnectionAdapter {
    Connection connection;

    @Override
    public Connection getConnection() {
        connection = ConnectionPool.getInstance().getConnection();
        return connection;
    }
}