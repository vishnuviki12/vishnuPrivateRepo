import java.util.regex.*;
import java.util.Arrays;
public class Tdd {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\W");
        String[] s1 = p.split("hello@ wor#ld");

        for (String s: s1) {
            System.out.println(s);
        }
    }
}
