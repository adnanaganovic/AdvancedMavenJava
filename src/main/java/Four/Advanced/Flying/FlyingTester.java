package Four.Advanced.Flying;

public class FlyingTester {
    public static void main(String[] args) {
        Flyable flyable = FlyableFactory.flyingObject();
        flyable.fly();
    }
}
