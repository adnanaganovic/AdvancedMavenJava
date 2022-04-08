package SixAdvanced;

public class SixDemoThread extends Thread {
    public static void main(String[] args) {
        System.out.println("Vozdra raja... kaže Thread: "+Thread.currentThread().getName());
//        1.Način inniciranja novog Thread
        SixDemoThread sixDemoThread = new SixDemoThread();
        new Thread(sixDemoThread).start();
//        2.Način iniciranja Threada preko implementacije interfejsa Runnable
        new Thread(new SixWorker()).start();
    }

    @Override
    public void run() {
        System.out.println("Ja sam pomoćnik MAIN threade i ime mi je: " + Thread.currentThread().getName());
    }
}
