package Four.Advanced.Flying;

public class FlyableFactory {



    private static class Plane implements Flyable{


        @Override
        public void fly() {
            System.out.println("Avion leti dok ima goriva...");
        }
    }

    public static Flyable flyingObject(){
        return new Plane();
    }
}
