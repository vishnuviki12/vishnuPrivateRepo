import java.util.List;
import java.util.ArrayList;
public class RentalGeneric<T, X> {
    List<T> one = new ArrayList<T>();
    List<X> two = new ArrayList<X>();

    public void add(T one, X two) {
        this.one.add(one);
        this.two.add(two);
    }

    public T get(int i) {
        return this.one.get(i);
    }

    public X getX(int i) {
        return this.two.get(i);
    }
}
