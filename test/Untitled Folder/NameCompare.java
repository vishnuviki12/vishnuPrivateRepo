import java.util.Comparator;
public class NameCompare implements Comparator<Car> {

    public int compare(Car c1, Car c2) {

        return c2.compareTo(c1);
    }
}
