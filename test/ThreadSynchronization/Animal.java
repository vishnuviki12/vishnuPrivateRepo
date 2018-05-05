public class Animal {

    public synchronized void eat() {
        /*try{
            Thread.sleep(500);
        }
        catch(InterruptedException e) {}*/
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName()+" eats");
        }
    }
}
