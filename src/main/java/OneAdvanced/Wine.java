package OneAdvanced;

public class Wine extends Product {

    private static final double ADDITIONAL_TAX = 10;

    public Wine(String serialNumber, double price) {
        super(serialNumber, price);
    }

    @Override
    public double calculateGrossPrice() {
        double baseGross = super.calculateGrossPrice();
        double additionalTaxAmount = baseGross*ADDITIONAL_TAX/100;
        double totalGross = baseGross + additionalTaxAmount;
        return totalGross;
    }
}
