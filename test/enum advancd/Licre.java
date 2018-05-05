enum Licre {
    BEER(100) {
        public void print() {
            System.out.println(price);
        }

    }, RUM("white"){
        public void print() {
            System.out.println(color);
        }
    }, VODKA(700) {
        public void print() {
            System.out.println(price);
        }
    };
    int price;
    String color;

    Licre(int price) {
        this.price = price;
    }
    Licre(String color) {
        this.color = color;
    }


    public abstract void print();

};
