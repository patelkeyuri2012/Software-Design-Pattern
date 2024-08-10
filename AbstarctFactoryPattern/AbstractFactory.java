public abstract class AbstractFactory {
    public AbstractFactory() {

    }

    public abstract PropertyTax getPropertyTax();

    public abstract WaterTax getWaterTax();

    public static AbstractFactory getFactory(int i) {

        switch (i) {
            case 1:
                return new AMCFactory();
            case 2:
                return new VMCFactory();
            default:
                return null;
        }
    }
}
