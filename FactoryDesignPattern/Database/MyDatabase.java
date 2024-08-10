import java.sql.ResultSet;
import java.sql.SQLException;

public interface MyDatabase {

    public void connection(String username, String password, String url, String driver)
            throws SQLException, ClassNotFoundException;

    public void forName(String driver) throws ClassNotFoundException;

    public ResultSet executeQuery(String query) throws SQLException;

    public int executeUpdate(String query) throws SQLException;

    public void close() throws SQLException;

    public void setDriver(String driver);

    public String getDriver();

    public void setUrl(String url);

    public String getUrl();

    public void setUsername(String username);

    public String getUsername();

    public void setPassword(String password);

    public String getPassword();
}
