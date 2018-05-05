import java.io.*;
public class Test {
    public static void main(String[] args) {

        try {
            File f = new File("abc");
            f.mkdir();
            File f2 = new File(f, "abc.txt");
            f2.createNewFile();

        } catch (Exception e) {

        }
    }
}
