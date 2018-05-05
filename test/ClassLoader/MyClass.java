public class MyClass {
    public static void main(String[] args) {
        try {
            Class c1 = Class.forName("MyClass");
            Class c2 = Class.forName("java.lang.Thread");
            System.out.println(c1.getName());
            System.out.println(c2.getName());

        }
        catch (Exception e) {

        }
    }
}
