public class Outer {
    static int x = 20;
    static int y = 30;

    public class NewInner {

    }

    void m1() {
        int m = 10;

        final class Inner {

            void m2() {
                System.out.println(x);
                System.out.println(y);
                System.out.println(m);
            }
        }
        Inner i = new Inner();
        i.m2();
    }
}
