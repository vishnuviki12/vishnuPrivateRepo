public class Car {
    String tyre = "punchure";

    public void drive() throws TyrePunchureException {
        if (tyre.equals("punchure")) {
            throw new TyrePunchureException();
        }
    }
}