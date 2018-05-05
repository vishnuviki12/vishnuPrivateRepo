import java.io.*;
import java.util.*;
class ReSortComparator implements Comparator<String> {

    public int compare(String a, String b) {
        return b.compareTo(a);
    }
}
