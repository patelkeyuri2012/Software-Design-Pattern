import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RequestHandler negativeHandler = new NegativeHandler();
        RequestHandler zeroHandler = new ZeroHandler();
        RequestHandler positiveHandler = new PositiveHandler();

        negativeHandler.setNextRequestHandler(zeroHandler);
        zeroHandler.setNextRequestHandler(positiveHandler);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        RequestHandler currentHandler = null;

        if (number < 0) {
            currentHandler = negativeHandler;
        } else if (number == 0) {
            currentHandler = zeroHandler;
        } else {
            currentHandler = positiveHandler;
        }

        if (currentHandler != null && currentHandler.process(number)) {
            System.out.println(
                    "Number " + number + " was handled by " + currentHandler.getClass().getSimpleName() + ".");
        } else {
            System.out.println("Number " + number + " was not handled by any handler.");
        }
    }
}
