class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(double amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("Payment strategy not set.");
        }
    }
}