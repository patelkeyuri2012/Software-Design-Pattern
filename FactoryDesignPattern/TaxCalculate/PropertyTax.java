public class PropertyTax implements TaxCalculate {

    public double PROPERTY_TAX_RATE;
    public double propertyValue;

    public PropertyTax() {

    }

    public PropertyTax(double propertyValue, double PROPERTY_TAX_RATE) {
        this.propertyValue = propertyValue;
        this.PROPERTY_TAX_RATE = PROPERTY_TAX_RATE;
    }

    public double calculateTax() {
        return propertyValue * PROPERTY_TAX_RATE;
    }

    public String getTaxDetails() {
        return "" + calculateTax();
    }
}
