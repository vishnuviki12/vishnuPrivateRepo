public class MyThread extends Thread {
    int amount = 0;

    public int getAmount() {
        return this.amount;
    }

    public void run() {
        synchronized(this) {
            System.out.println("child thread starts  calculations");
            for (int i=1; i<=100; i++) {
                amount += i;
            }
            System.out.println("child thread trying to give notification");
            this.notify();
        }
    }
}
