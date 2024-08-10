import java.sql.*;

public class MySql {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // fetch driver class of jdbc
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connect database (path_of_database, user_name, password)
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sem2", "root", "");

            if (con == null) {
                System.out.println("\nconnection fail");
            } else {
                System.out.println("\nconnection success");
            }

        } catch (

        ClassNotFoundException cnfe) {
            System.out.println("Class Not Found : " + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println("SQL Exception : " + se.getMessage());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close(); // close ResultSet
                }
                if (st != null) {
                    st.close(); // close Statement
                }
                if (con != null) {
                    con.close(); // close Connection
                }
            } catch (SQLException e) {
                System.out.println("SQL Exception : " + e.getMessage());
            }
        }
    }
}
