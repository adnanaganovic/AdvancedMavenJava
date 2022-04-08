package SixAdvanced.oop;

public class AlienDemo {
    public static void main(String[] args) {
        AlienSingleton Alien1 = AlienSingleton.getAlienSingleton();
        AlienSingleton Alien2 = AlienSingleton.getAlienSingleton();
        AlienSingleton Alien3 = AlienSingleton.getAlienSingleton();
        AlienSingleton Alien4 = AlienSingleton.getAlienSingleton();
        AlienSingleton Alien5 = AlienSingleton.getAlienSingleton();

        System.out.println(Alien1.hashCode());
        System.out.println(Alien2.hashCode());
        System.out.println(Alien3.hashCode());
        System.out.println(Alien4.hashCode());
        System.out.println(Alien5.hashCode());

    }
}
