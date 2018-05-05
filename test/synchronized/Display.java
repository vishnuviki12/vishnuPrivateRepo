public class Display {

    public void wish(String name) {
        synchronized(this) {
            System.out.println("one lakh of code");
            for (int i=0; i<10; i++) {
                System.out.print("Good morning:");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {}
                System.out.println(name);
            }
            System.out.println("two lakh of code");
        }
    }
}
