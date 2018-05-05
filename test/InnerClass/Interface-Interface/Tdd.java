public class Tdd {
    public static void main(String[] args) {

        Outer o = new Test1();
        o.outer();

        Outer.Inner i = new Test2();
        i.inner();
    }
}
