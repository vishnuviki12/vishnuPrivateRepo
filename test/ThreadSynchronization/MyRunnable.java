public class MyRunnable implements Runnable {
    Animal a;

    public MyRunnable(Animal a) {
        this.a = a;
    }

    public void run() {
        a.eat();
    }
}
