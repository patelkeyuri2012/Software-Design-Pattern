public class Cookies extends Garnish {

    private double price = 0.50;

    public Cookies(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with Cookie";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + price;
    }
}
