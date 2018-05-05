enum Size {
    SMALL (38), MEDIUM (40), LARGE(42);
    private int size;

    Size(int size) {
        this.size = size;
    }

    public void print() {
        //return this.size;
        System.out.println(this.size);
    }
};
