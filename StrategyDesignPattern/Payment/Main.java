public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new Credit("1234567890123456", "12/24", "123", "John Doe"));
        context.checkout(100.00);

        context.setStrategy(new Debit("9876543210987654", "12/24", "321", "John Doe"));
        context.checkout(50.00);

        context.setStrategy(new NetBanking("Example Bank", "username", "password"));
        context.checkout(75.00);

        context.setStrategy(new UPI("9876543210", "1234"));
        context.checkout(25.00);
    }
}
