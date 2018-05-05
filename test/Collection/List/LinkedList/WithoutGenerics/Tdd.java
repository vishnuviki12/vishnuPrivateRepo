import java.util.*;
public class Tdd {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("A");
        l.addFirst(new String("B"));
        l.addFirst("C");
        l.add(100);
        l.addLast(null);
        l.addLast("Y");
        l.add(200);

        System.out.println(l);
        System.out.println(l.removeLast());
        System.out.println(l);

    }
}
