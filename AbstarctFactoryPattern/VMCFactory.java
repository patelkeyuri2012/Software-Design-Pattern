public class VMCFactory extends AbstractFactory {

    @Override
    public PropertyTax getPropertyTax() {
        return new VMCPropertyTax();

    }

    @Override
    public WaterTax getWaterTax() {
        return new VMCWaterTax();

    }

}