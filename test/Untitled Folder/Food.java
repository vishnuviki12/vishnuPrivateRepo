public class Food {

    Popcorn p = new Popcorn() {
        public void pop() {
            System.out.println("anonymous  pop");
        }


    };

    Popcorn p2 = new Popcorn() {

        public void pop() {
            System.out.println("anonymous two pop");
        }
    };

    void popIt() {
        p.pop();
        p2.pop();
    }
}
