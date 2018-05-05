public class ClassA {

    public synchronized void d1(ClassB b) {
        System.out.println("Thread1 started execution of d1() method");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        b.last();
    }

    public synchronized void last() {
        System.out.println("inside ClassA, last method");
    }
}
