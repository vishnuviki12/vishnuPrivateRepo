import java.io.*;
public class Tdd {
    public static void main(String[] args) {
        char[] items = null;
        try {
            File f = new File("abc.txt");
            items = new char[(int)f.length()];

            FileReader fr = new FileReader(f);
            int count = fr.read(items);
            fr.close();

            for (char c: items) {
                System.out.println(c);
            }

        }
        catch (Exception e) {

        }
    }
}
