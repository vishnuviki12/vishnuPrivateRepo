import java.io.*;
public class Tdd {
    public static void main(String[] args) {
        char[] in = new char[100];
        int size = 0;
        try {
            File f = new File("file.txt");


            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);

            size = br.read(in);

            System.out.println(size);

        }
        catch(Exception e) {

        }
    }
}
