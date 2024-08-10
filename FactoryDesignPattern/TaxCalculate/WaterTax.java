public class WaterTax implements TaxCalculate {

    public double WATER_TAX_RATE;
    public double propertySize;

    public WaterTax() {

    }

    public WaterTax(double propertySize, double WATER_TAX_RATE) {
        this.propertySize = propertySize;
        this.WATER_TAX_RATE = WATER_TAX_RATE;
    }

    public double calculateTax() {
        return propertySize * WATER_TAX_RATE;
    }

    public String getTaxDetails() {
        return "" + calculateTax();
    }

}
