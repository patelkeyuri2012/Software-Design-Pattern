public class Credit implements Strategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private String cardHolderName;

    public Credit(String cardNumber, String expiryDate, String cvv, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }
}
