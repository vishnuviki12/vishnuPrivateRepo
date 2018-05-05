public class Tdd {
    public static void main(String[] args) {

        Vehicle.DefaultVehicle v1 = new Vehicle.DefaultVehicle();
        System.out.println(v1.wheels());

        Vehicle v2 = new Bus();
        System.out.println(v2.wheels());
    }
}
