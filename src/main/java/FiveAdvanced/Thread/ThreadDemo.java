package FiveAdvanced.Thread;

public class ThreadDemo extends Thread {          //Thread treba imati funnkciju run
    public static void main(String[] args) {
//        String imeThreade = Thread.currentThread().getName();
//        System.out.println(imeThreade);

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());

//        new ThreadDemo().start();    //Poziv novog Threada kada extendamo klasu Thread
//        new ThreadDemo().start();   //Poziv još jednog Threada

        new Thread(new Worker()).start();   //Poziv Threada preko "Worker" klase (koja implementira Runnable i run metodu)
    }


        public void run(){
            System.out.println("Vozdra raja" + currentThread().getName());
            System.out.println("Bla bla bla" + currentThread().getName());
        }
    }

