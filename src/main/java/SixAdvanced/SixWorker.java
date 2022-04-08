package SixAdvanced;

public class SixWorker implements Runnable{
    @Override
    public void run() {
        System.out.println("Ja sam pomoćnik MAIN threade i ime mi je: " + Thread.currentThread().getName());
    }
}
