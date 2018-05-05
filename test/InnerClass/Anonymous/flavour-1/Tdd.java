public class Tdd {
    public static void main(String[] args) {

        Popcorn p = new Popcorn();
        Popcorn p1 = new Popcorn() {
            void taste() {
                System.out.println("spicy");
            }
        };
        p1.taste();

        Popcorn p2 = new Popcorn() {
            void taste() {
                System.out.println("sweet");
            }
        };
        p2.taste();

        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());
    }
}
