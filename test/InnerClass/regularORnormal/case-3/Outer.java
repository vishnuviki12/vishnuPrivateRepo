public class Outer {
    int age =23;
    static String name = "vishnu";

    class Inner {
        void m1() {
            System.out.println(age);
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        new Outer().new Inner().m1();
    }
}
