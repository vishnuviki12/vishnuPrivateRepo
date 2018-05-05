import java.lang.Runnable;
public class MyRunnable implements Runnable {
    Thread t;
    String threadName;

    MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        System.out.println("running-"+threadName);
        try {
            for(int i=0; i<5; i++) {
                System.out.println("Thread:"+threadName+"-"+(i+1));
                System.out.println(Thread.currentThread().getName());
            }
        }
        catch(Exception e) {

        }
        System.out.println("Thread:"+threadName+" existing...");

    }

    public void invoke() {
        System.out.println("starting-"+threadName);
        if(t == null) {
            t = new Thread(this);
        }
        t.start();
    }
}
