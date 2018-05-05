public class Tdd {
    public static void main(String[] args) {
        Car c = new Car();
        try {
            c.drive();
        }
        catch(TyrePunchureException e) {
            c.tyre = "finish";
        }
        
    }
}