package SevenAdvanced.factory;

public class Coffee implements Beverage{
    @Override
    public void drink() {
        System.out.println("Pijem esspresso i on košta: " +cost() +"KM");

    }

    @Override
    public double cost() {
        return 1.5;
    }
}
