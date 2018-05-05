import java.util.regex.*;
public class Tdd {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher("abcDDDDn123mDD#@$mmmkk");

        while(m.find()) {
            System.out.println(m.start()+"--"+m.end()+"->"+m.group());
        }
    }
}
