package SixAdvanced.oop;

public class AlienSingleton {
    private static AlienSingleton SINGLETON = null;

    private AlienSingleton(){
        System.out.println("Kontstruktor klase AlienSingleton...");
    }

    public static AlienSingleton getAlienSingleton() {
        if(SINGLETON == null){
            SINGLETON = new AlienSingleton();
        }
        return SINGLETON;
    }
}
