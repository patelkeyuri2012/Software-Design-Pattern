public class AMCFactory extends AbstractFactory {

    @Override
    public PropertyTax getPropertyTax() {
        return new AMCPropertyTax();

    }

    @Override
    public WaterTax getWaterTax() {
        return new AMCWaterTax();

    }

}