import java.util.Calendar;

public class GetInstance {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date and time: " + calendar.getTime());
    }
}
