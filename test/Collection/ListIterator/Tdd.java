import java.util.*;
public class Tdd {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        for (int i=0; i<10; i++) {
            al.add(i+10);
        }
        ListIterator li = al.listIterator();
        while(li.hasNext()) {
            Integer i = (Integer)li.next();
            if(i == 19) {
                li.add(200);
            }
        }
        System.out.println(al);

        System.out.println(al);
        while(li.hasPrevious()) {
            Integer i = (Integer)li.previous();
            if(i == 10) {
                li.set(100);
            }
        }
        System.out.println(al);
    }
}
