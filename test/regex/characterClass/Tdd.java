import java.util.regex.*;
public class Tdd {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("[^abc]");
        Matcher m = p.matcher("amnjbollc");

        while(m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
    }
}
