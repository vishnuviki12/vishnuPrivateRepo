public class DeadLock extends Thread {
    ClassA a = new ClassA();
    ClassB b = new ClassB();

    public void m1() {
        this.start();
        a.d1(b);
    }

    public void run() {
        b.d2(a);
    }
}
