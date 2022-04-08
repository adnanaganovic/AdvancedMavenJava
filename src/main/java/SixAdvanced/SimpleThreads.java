package SixAdvanced;

import FiveAdvanced.Thread.Worker;

public class SimpleThreads {
    static void threadMessages (String message){
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }
    private static class MessageLoop implements Runnable{
        @Override
        public void run() {
            String[] važnePoruke ={
                    "Threadove možete kreirati kroz extands Thread",
                    "Threadove možemo kreirati i kroz implements Runnable",
                    "Uraditi zadaću 3 zadatka"
            };

            try {
                for (String vaznaPoruka : važnePoruke) {
                    Thread.sleep(4000);
                    threadMessages(vaznaPoruka);
                }
            }catch (InterruptedException exc){
                threadMessages("Nisam završio a prekinut sam");
            }
        }

        public static void main(String[] args) throws Exception {
            long strpljenje = 1000*60*60;
            long startTime = System.currentTimeMillis();
            Thread worker = new Thread(new MessageLoop());
            worker.start();
            while (worker.isAlive()){
                threadMessages("Još te čekam...");
                //Čekat ću te 1 sekundu
                worker.join(1000);
                long period = System.currentTimeMillis()-startTime;
                if (period>strpljenje){
                    threadMessages("Umoran sam od čekanja...");
                    worker.interrupt();
                }
            }
            threadMessages("Konačno si završio");
        }
    }
}
