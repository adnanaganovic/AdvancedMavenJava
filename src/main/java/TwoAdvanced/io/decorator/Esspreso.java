package TwoAdvanced.io.decorator;

public class Esspreso extends Beverage {
    public Esspreso() {
        super("Esspreso");
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
