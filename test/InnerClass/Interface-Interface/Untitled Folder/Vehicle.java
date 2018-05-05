public interface Vehicle {

    public int wheels();

    class DefaultVehicle {

        public int wheels() {
            return 2;
        }
    }
}
