package workshop14.factory;

public class Test06 {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        String user = "academy";
        String pass = "pass";

        FactoryBiz factoryBiz = new FactoryBiz(driver, url, user, pass);
        factoryBiz.getFactoryAll();
    }
}
