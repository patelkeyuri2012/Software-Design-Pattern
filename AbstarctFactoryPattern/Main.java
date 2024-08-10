import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. AMC");
        System.out.println("2. VMC");
        System.out.print("Enter your city : ");
        int ch = sc.nextInt();

        AbstractFactory at;
        at = AbstractFactory.getFactory(ch);

        if (at == null) {
            return;
        }

        System.out.println("1. Property Tax");
        System.out.println("2. Water Tax");
        System.out.print("Enter tax : ");
        int tax = sc.nextInt();

        switch (tax) {
            case 1:
                System.out.print("Enter your property value: ");
                double propertyValue = sc.nextDouble();

                System.out.print("Enter rate to calculate property tax: ");
                double pRate = sc.nextDouble();

                System.out.print("Is your property considered a heritage property? (true/false): ");
                boolean heritage = sc.nextBoolean();

                PropertyTax ptCalculator = at.getPropertyTax();

                ptCalculator.setpropertyValue(propertyValue);
                ptCalculator.setPropertyTaxRate(pRate);
                ptCalculator.setHeritage(heritage);

                System.out.println("Property tax: " + ptCalculator.getPropertyTax());

                break;
            case 2:
                System.out.print("Enter water used by you in liter : ");
                double liter = sc.nextDouble();

                System.out.print("Enter rate to calculate water tax: ");
                double wRate = sc.nextDouble();

                System.out.print("Is your property considered city? (true/false): ");
                boolean city = sc.nextBoolean();

                WaterTax wtCalculator = at.getWaterTax();

                wtCalculator.setliter(liter);
                wtCalculator.setWaterTaxRate(wRate);
                wtCalculator.setCity(city);

                System.out.println("Water tax: " + wtCalculator.getWaterTax());

                break;
            default:
                break;
        }
    }
}
