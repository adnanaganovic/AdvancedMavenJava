package FiveAdvanced.Thread;

public class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Vozdra raja.... Thread:" + Thread.currentThread().getName());
        System.out.println("Bla bla bla.... Thread: " + Thread.currentThread().getName());
    }
}
