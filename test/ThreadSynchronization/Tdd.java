public class Tdd {
    public static void main(String[] args) {

        Animal a = new Animal();
        Thread ta = new Thread(new MyRunnable(a), "Tiger");
        Thread tb = new Thread(new MyRunnable(a), "Fox");
        Thread tc = new Thread(new MyRunnable(a), "Deer");
        ta.start();
        tb.start();
        tc.start();
    }
}
