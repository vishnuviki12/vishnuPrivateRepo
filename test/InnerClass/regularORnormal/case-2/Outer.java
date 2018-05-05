public class Outer {
    class Inner {
        void m1() {
            System.out.println("inner");
        }
    }
    void m2() {
        Inner i = new Inner();
        i.m1();
    }
    public static void main(String[] args) {
        new Outer().m2();
    }
}
