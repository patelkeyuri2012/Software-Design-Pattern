public class InvoiceFactory {

    public static Invoice getInvoice(int i) {
        switch (i) {
            case 1:
                return new WithFooter();
            case 2:
                return new WithoutFooter();
            case 3:
                return new WithHeader();
            case 4:
                return new WithoutHeader();
            default:
                System.out.println("Invalid choice");
                return null;
        }
    }
}
