package SevenAdvanced.factory;

import TwoAdvanced.io.decorator.Esspreso;

public enum BeverageFactory {

    ESSPRESO (new Coffee()),
    COCA_COLA(new CocaCola()),
    MILKDECORATOR(new MilkDecorator(new Coffee())),
    MILKDECORATOR_TEA(new MilkDecorator(new Tea()));

    private final Beverage beverage;

    BeverageFactory(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
