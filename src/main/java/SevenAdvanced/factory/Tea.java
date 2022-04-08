package SevenAdvanced.factory;

public class Tea implements Beverage{
    @Override
    public void drink() {
        System.out.println("Pijem Čaj i košta: "+cost());

    }

    @Override
    public double cost() {
        return 2.0;
    }
}
