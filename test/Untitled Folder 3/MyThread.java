public class MyThread extends Thread {
    public static Thread mt;

    public void run() {
        try {
            for (int i=0; i<5; i++) {
                System.out.println("child thread");
                //Thread.sleep(5000);
            }
        }
        catch(Exception e) {
            System.out.println("child thread interrupterd");
        }
    }
}
