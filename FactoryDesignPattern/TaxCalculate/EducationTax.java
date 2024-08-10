public class EducationTax implements TaxCalculate {

    public double EDUCATION_TAX_RATE;
    public double income;

    public EducationTax() {

    }

    public EducationTax(double income, double EDUCATION_TAX_RATE) {
        this.income = income;
        this.EDUCATION_TAX_RATE = EDUCATION_TAX_RATE;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public double calculateTax() {
        return income * EDUCATION_TAX_RATE;
    }

    public String getTaxDetails() {
        calculateTax();
        return "";
    }
}
