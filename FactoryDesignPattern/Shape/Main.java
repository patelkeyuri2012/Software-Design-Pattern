import java.util.*;

public class Main {
    public static void main(String args[]) {
        Shape s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your shape  : ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        int ch = sc.nextInt();

        s = ShapeFactory.getShape(ch);
        s.draw();
        s.fillColor();
    }
}
