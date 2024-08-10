public class VMCPropertyTax implements PropertyTax {

    private double propertyValue, rate;
    private boolean isHeritage;

    public VMCPropertyTax() {

    }

    @Override
    public void setpropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public double getpropertyValue() {
        return propertyValue;
    }

    @Override
    public void setPropertyTaxRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getPropertyTaxRate() {
        return rate;
    }

    @Override
    public void setHeritage(boolean isHeritage) {
        this.isHeritage = isHeritage;
    }

    @Override
    public boolean getHeritage() {
        return isHeritage;
    }

    @Override
    public double getPropertyTax() {
        if (heritageTax()) {
            return propertyValue * rate / rate;
        } else {
            return propertyValue * rate;
        }
    }

    @Override
    public boolean heritageTax() {
        return false;
    }
}
