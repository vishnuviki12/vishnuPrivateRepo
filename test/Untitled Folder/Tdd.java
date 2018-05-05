import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class Tdd {
    public static void main(String[] args) {

        Test test = new Test();
        Check c = new Check(test);
        c.start();

    }
}
