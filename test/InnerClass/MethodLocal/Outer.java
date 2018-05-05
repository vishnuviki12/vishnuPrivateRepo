public class Outer {
    int x = 10;
    static int y = 20;

    void m1() {
        int x = 20;

        class Inner {

            void m2() {
                System.out.println(x);
            }
        }

        Inner i = new Inner();
        i.m2();
    }
}
