import java.util.*;
public class Tdd {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        for (int i=1; i<=10; i++) {
            l.add(i);
        }
        System.out.println(l);
        Iterator it = l.iterator();

        while (it.hasNext()) {
            Integer in = (Integer)it.next();

            if (in %2 == 0) {
                System.out.println(in);
            }
            else {
                it.remove();
            }
        }

        System.out.println(l);
    }
}
