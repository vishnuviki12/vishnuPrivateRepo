public class Test {
    public static void main(String[] args) {

        int x = 10;

        try {
            assert(x > 10);
        } catch (Error e) {
            System.out.println("catch assert");
        }
    }
}
