public enum Model {
    BENZ(10), BMW(20), AUDI(30);
    private int number;

    Model(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
};
