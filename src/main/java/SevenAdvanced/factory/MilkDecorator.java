package SevenAdvanced.factory;

public class MilkDecorator implements Beverage{

private final Beverage beverage;

public MilkDecorator (Beverage beverage){
    this.beverage = beverage;
}
    @Override
    public void drink() {
    beverage.drink();
        System.out.println("s mlijekom");

    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }
}
