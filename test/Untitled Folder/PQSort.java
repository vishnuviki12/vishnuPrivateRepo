import java.util.Comparator;
public class PQSort implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {
        return a - b;
    }
}
