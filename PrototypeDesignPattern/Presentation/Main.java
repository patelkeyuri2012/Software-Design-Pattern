import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your design: ");
        String design = sc.next();
        System.out.print("Enter your message: ");
        String message = sc.next();

        GreetingCard original = new GreetingCard(design, message);
        GreetingCard clone = (GreetingCard) original.clone();

        clone.setDesign(design);
        clone.setMessage(message);

        System.out.println("\n" + clone.display());
    }
}
