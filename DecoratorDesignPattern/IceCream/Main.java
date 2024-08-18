public class Main {

    public static void main(String[] args) {
        IceCream vanillaIceCream = new Vanilla();
        System.out.println("Description: " + vanillaIceCream.getDescription());
        System.out.println("Cost: " + vanillaIceCream.getCost());

        

        IceCream cookiesIceCream = new Cookies(vanillaIceCream);
        System.out.println("Description: " + cookiesIceCream.getDescription());
        System.out.println("Cost: " + cookiesIceCream.getCost());

        IceCream specialIceCream = new Nuts(new Cookies(vanillaIceCream));
        System.out.println("Description: " + specialIceCream.getDescription());
        System.out.println("Cost: " + specialIceCream.getCost());
    }
}