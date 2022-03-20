package TwoAdvanced.io.decorator;

public class BeverageConsumer {
    public static void main(String[] args) {

        Beverage bosnianCaffe = new BosnianCaffe();
        consumeBeverage(bosnianCaffe);

        Beverage esspreso = new Esspreso();
        consumeBeverage(esspreso);
        Beverage cocacola = new CocaCola();
        consumeBeverage(cocacola);

        MilkDecorator  milkDecorator = new MilkDecorator(esspreso);
        consumeBeverage(milkDecorator);

    }

    public static void consumeBeverage (Beverage beverage) {
        System.out.println("Pijem " + beverage.getName()+ " i to košta " + beverage.cost());
    }


}
