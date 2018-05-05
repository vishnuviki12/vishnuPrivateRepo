
import java.util.*;
public class Tdd {
    public static void main(String[] args) {

        String text = "hello world";
        String pText = "hello";

        Pattern p = new Pattern(pText);
        Matcher m = new Matcher(text);

        System.out.println(m.find());

    }
}
