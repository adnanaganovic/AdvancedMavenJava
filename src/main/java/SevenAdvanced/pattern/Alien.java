package SevenAdvanced.pattern;

public class Alien {

private static Alien SINGLETON = null;

    private Alien(){
            System.out.println("Konstruše se Alien");
        }


    private void alienIsOnEarth(){
            System.out.println("Vanzemaljac se spustio na zemlju");
        }

        public static Alien instance(){
        if (SINGLETON == null) {
            SINGLETON = new Alien();
        }
        return SINGLETON;
        }
    }

