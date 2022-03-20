package TwoAdvanced.io.decorator;

public class BosnianCaffe extends Beverage {
    public BosnianCaffe() {
        super("Bosanska kafa");
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
