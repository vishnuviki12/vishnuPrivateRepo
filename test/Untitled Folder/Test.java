
public final class Test implements Runnable {

    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("ID:-"+Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getName());
        }
    }
}
