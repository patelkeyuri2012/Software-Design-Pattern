public class NetBanking implements Strategy {
    private String bankName;
    private String userName;
    private String password;

    public NetBanking(String bankName, String userName, String password) {
        this.bankName = bankName;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Net Banking");
    }
}
