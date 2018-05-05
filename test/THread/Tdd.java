import java.lang.Thread;
public class Tdd {
    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable("Thread-1");
        r1.invoke();

        MyRunnable r2 = new MyRunnable("Thread-2");
        r2.invoke();

        MyRunnable r3 = new MyRunnable("Thread-");
        r3.invoke();

    }
}
