public class Tdd {
    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();
        t.start();
        t.interrupt();
        
        System.out.println("main completes");


    }
}
