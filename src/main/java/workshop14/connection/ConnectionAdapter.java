package workshop14.connection;

import java.sql.Connection;

public interface ConnectionAdapter {
    Connection getConnection();
}