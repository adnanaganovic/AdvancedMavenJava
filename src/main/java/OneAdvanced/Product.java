package OneAdvanced;

public class Product {
    public static final double TAX_PERCENTAGE = 17;

    private String serialNumber;
    private double netoPrice;

    public Product (String serialNumber, double price){
        this.serialNumber = serialNumber;
        this.netoPrice = price;
    }


    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public void setNetoPrice(double netoPrice) {
        this.netoPrice = netoPrice;
    }
    public double calculateGrossPrice (){
        double grossPrice = netoPrice+taxAmount();
        return grossPrice;
    }

    public double taxAmount (){
        double taxAmount = netoPrice * TAX_PERCENTAGE/100;
        return  taxAmount;
    }

    @Override
    public String toString() {
        return serialNumber + " , price:" +
                calculateGrossPrice();
}}
