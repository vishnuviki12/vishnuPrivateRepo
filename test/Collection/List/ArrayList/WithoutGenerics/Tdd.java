import java.util.*;
public class Tdd {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add("A");
        l.add("B");
        l.add("A");
        l.add(null);
        System.out.println(l);
        l.remove(3);
        l.remove("A");
        System.out.println(l);
        l.add(2,"C");
        l.add("M");
        System.out.println(l);
    }
}
