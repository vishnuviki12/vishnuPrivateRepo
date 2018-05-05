public class Tdd {
    public static void main(String[] args) {

        Thread t = new Thread() {
            public void run() {
                for (int i=0; i<5; i++) {
                    System.out.println("child thread");
                    try {
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {}
                }
            }
        };
        t.start();

        for (int i=0; i<5; i++) {
            System.out.println("main thread");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
    }
}
