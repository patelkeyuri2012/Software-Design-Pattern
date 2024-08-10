import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "1. Calculate Water Tax \n2. Calculate Education Tax \n3. Calculate Property Tax");
        System.out.print("\nEnter your choice : ");
        int ch = sc.nextInt();

        TaxCalculate i = TaxCalculateFactory.getTax(ch);
        i.calculateTax();

        switch (ch) {
            case 1:
                System.out.println("WaterTax");
                break;
            case 2:
                System.out.print("income : ");
                double income = sc.nextInt();
                break;
            case 3:
                System.out.println("PropertyTax");
                break;
            default:

        }

        System.out.println("Tax is " + i.getTaxDetails() + " rs.");

    }
}