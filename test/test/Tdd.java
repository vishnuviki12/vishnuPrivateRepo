import java.util.*;
public class Tdd {
    public static void main(String[] args) {
      ArrayList<String> s = new ArrayList<String>();
      s.add("abc");
      s.add("bnm");
      
      System.out.println(s);
      String a = "abc";
      s.remove(a);
      System.out.println(s);
     }
}
