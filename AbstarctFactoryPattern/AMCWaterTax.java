public class AMCWaterTax implements WaterTax {

    private double liter, rate;
    private boolean isCity;

    public AMCWaterTax() {

    }

    @Override
    public void setWaterTaxRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getWaterTaxRate() {
        return rate;
    }

    @Override
    public void setliter(double liter) {
        this.liter = liter;
    }

    @Override
    public double getliter() {
        return liter;
    }

    @Override
    public void setCity(boolean isCity) {
        this.isCity = isCity;
    }

    @Override
    public boolean getCity() {
        return isCity;
    }

    @Override
    public double getWaterTax() {
        if (cityTax()) {
            return liter * rate / rate;
        } else {
            return liter * rate;
        }
    }

    @Override
    public boolean cityTax() {
        return false;
    }
}
