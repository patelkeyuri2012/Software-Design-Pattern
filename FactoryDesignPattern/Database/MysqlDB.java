import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDB implements MyDatabase {

    private String driver;
    private String url;
    private String username;
    private String password;
    private Connection con;

    public MysqlDB() {

    }

    @Override
    public void connection(String username, String password, String url, String driver)
            throws SQLException, ClassNotFoundException {
        forName(driver);
        con = DriverManager.getConnection(url, username, password);

    }

    @Override
    public void close() throws SQLException {
        if (con != null) {
            con.close();
        }

    }

    @Override
    public ResultSet executeQuery(String query) throws SQLException {
        Statement st;
        st = con.createStatement();
        st.close();
        return st.executeQuery(query);
    }

    @Override
    public int executeUpdate(String query) throws SQLException {
        Statement st;
        st = con.createStatement();
        st.close();
        return st.executeUpdate(query);
    }

    @Override
    public void forName(String driver) throws ClassNotFoundException {
        Class.forName(driver);

    }

    @Override
    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String getDriver() {
        return driver;

    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;

    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;

    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;

    }
}
