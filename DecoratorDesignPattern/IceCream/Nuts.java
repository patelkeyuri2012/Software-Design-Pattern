public class Nuts extends Garnish {

    private double price = 0.70;

    public Nuts(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with Nuts";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + price;

    }
}