public class Outer {
    class Inner {
        void m1() {
            System.out.println("inner ");
        }
    }
    public static void main(String[] args) {

        /*Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.m1();*/

        /*Outer.Inner i = new Outer().new Inner();
        i.m1();*/

        new Outer().new Inner().m1();
    }
}
