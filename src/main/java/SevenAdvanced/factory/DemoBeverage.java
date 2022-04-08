package SevenAdvanced.factory;

public class DemoBeverage {
    public static void main(String[] args) {
        Beverage esspresso = BeverageFactory.ESSPRESO.getBeverage();
        esspresso.drink();
        esspresso.cost();

        Beverage cocaCola = BeverageFactory.COCA_COLA.getBeverage();
        cocaCola.drink();
        cocaCola.cost();

        Beverage milkDecoratorEsspresso = BeverageFactory.MILKDECORATOR.getBeverage();
        milkDecoratorEsspresso.drink();
        System.out.println("Kafa s mlijekom: " + milkDecoratorEsspresso.cost());

        Beverage milkDecoratorTea = BeverageFactory.MILKDECORATOR_TEA.getBeverage();
        milkDecoratorTea.drink();
        System.out.println("Čaj s mlijekom: " + milkDecoratorTea.cost());

    }
}
