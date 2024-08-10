public class UPI implements Strategy {
    private String mobileNumber;
    private String pin;

    public UPI(String mobileNumber, String pin) {
        this.mobileNumber = mobileNumber;
        this.pin = pin;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI");
    }
}