package FiveAdvanced.Thread;

public class SleepMessages {
    public static void main(String[] args) throws InterruptedException {
        String[] važnePoruke = {
                "Threadove možete kreirati kroz extands Thread",
                "Threadove možemo kreirati i kroz implements Runnable",
                "Uraditi zadaću 3 zadatka"
        };

        for (String poruka : važnePoruke){
            System.out.println(poruka);
            Thread.sleep(4000);
        }
    }

    }

