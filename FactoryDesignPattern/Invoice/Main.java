import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. With Footer \n2. Without Footer \n3. With Header \n4. Without Header");
        System.out.print("Enter your choice : ");
        int ch = sc.nextInt();

        Invoice i;
        i = InvoiceFactory.getInvoice(ch);
        i.printPage();
    }
}