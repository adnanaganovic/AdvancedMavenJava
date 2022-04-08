package SevenAdvanced.factory;

public class CocaCola implements Beverage{

    @Override
    public void drink() {
        System.out.println("Pijem kolu i košta me:"+cost()+"KM");
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
