public class TaxCalculateFactory {

    public static TaxCalculate getTax(int i) {

        double income = 0;
        double EDUCATION_TAX_RATE = 0;

        switch (i) {
            case 1:
                return new WaterTax();
            case 2:
                return new EducationTax(income, EDUCATION_TAX_RATE);
            case 3:
                return new PropertyTax();
            default:
                return null;
        }
    }
}
