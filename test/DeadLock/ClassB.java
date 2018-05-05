public class ClassB {

    public synchronized void d2(ClassA a) {
        System.out.println("Thread2 started execution of d2() method");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        a.last();
    }

    public synchronized void last() {
        System.out.println("inside ClassB, last method");
    }
}
