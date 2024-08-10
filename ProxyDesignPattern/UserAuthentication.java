import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserAuthentication {

    private static final String USER_DATA_FILE = "userdata.txt";

    public static String authenticate(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_DATA_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 3) {
                    String user = userData[0].trim();
                    String pass = userData[1].trim();
                    String role = userData[2].trim();
                    if (user.equals(username) && pass.equals(password)) {
                        return role; 
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
