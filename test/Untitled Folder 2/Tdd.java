public class Tdd {
    public static void main(String[] args) {

        try {
            new Tdd().go();
        }
        catch (Exception e) {
            System.out.println("error handled");
        }
    }

    void go() {
        go();
    }
}
