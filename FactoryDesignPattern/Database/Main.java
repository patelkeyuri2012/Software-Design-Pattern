import java.sql.SQLException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. MySQL\n2. Postgre\n3. Oracle");
        int ch = sc.nextInt();

        MyDatabase db = MyDatabaseFactory.getMyDatabase(ch);

        if(db == null){
            return;
        }

        System.out.print("Enter databse server driver: ");
        String driver = sc.next();
        System.out.print("Enter databse server url: ");
        String url = sc.next();
        System.out.print("Enter databse server username: ");
        String username = sc.next();
        System.out.print("Enter databse server password: ");
        String password = sc.next();

        db.setDriver(driver);
        db.setUrl(url);
        db.setUsername(username);
        db.setPassword(password);

        try {
            db.connection(username, password, url, driver);
            System.out.println("\nconnection sucessful");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
 * MySql:
 * Driver - com.mysql.cj.jdbc.Driver
 * Url - jdbc:mysql://localhost:3306/sem2
 * Username - root
 * Password -
 * 
 * Postgre:
 * Driver - org.postgresql.Driver
 * Url - jdbc:postgresql://localhost:5432/sem2
 * Username - postgres
 * Password - root
 * 
 * Oracle:
 * Driver - oracle.jdbc.driver.OracleDriver
 * Url - jdbc:oracle:thin:@localhost:1521:sem2
 * Username - SYSDBA
 * Password - root
 */
