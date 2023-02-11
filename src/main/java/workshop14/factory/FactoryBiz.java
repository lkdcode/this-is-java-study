package workshop14.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 계산 또는 유효성 검사를 처리하는 클래스
 */
public class FactoryBiz {
    private String driver;
    private String url;
    private String user;
    private String pass;


    public FactoryBiz() {
    }

    public FactoryBiz(String driver, String url, String user, String pass) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    public void getFactoryAll() {
        // 조회에 필요한 Connection 객체를 만들고, FactoryDAO 클래스의 getFactoryAll() 을 호출한다.
        FactoryDAO factoryDAO = new FactoryDAO();

        Connection connection;

        try {
            Class.forName(this.driver);
            connection = DriverManager.getConnection(this.url, this.user, this.pass);
            connection.setAutoCommit(false);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        factoryDAO.getFactoryAll(connection);

    }


}
