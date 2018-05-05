public class Tdd {
    public static void main(String[] args) throws Exception {

        MyThread t = new MyThread();
        t.start();
        Thread.sleep(10000);
        synchronized(t) {
            System.out.println("main thread stating calling to wait() method");
            try {
                t.wait(5000);
            } catch (InterruptedException e) { }
            System.out.println("main thread got notification");
            System.out.println(t.getAmount());
        }
    }
}
