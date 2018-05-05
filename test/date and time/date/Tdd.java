import java.util.*;
import java.text.*;
public class Tdd {
    public static void main(String[] args) {

        int n = 100;
        Locale l = new Locale("india");
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);
        System.out.println(nf.format(n));

    }
}
