import java.util.List;
public class Rental {
    private int maxNum;
    private List rentalPool;

    public Rental(int maxNum, List rentalPool) {
        this.maxNum = maxNum;
        this.rentalPool = rentalPool;
    }

    public Object getRental() {
        return this.rentalPool.get(0);
    }

    public void setRental(Object o) {
        this.rentalPool.add(o);
    }

}
