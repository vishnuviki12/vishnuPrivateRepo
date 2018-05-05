import java.io.*;
public class Tdd {
    public static void main(String[] args) {

        try {
            File f = new File("abc.txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("vishnu");
            bw.newLine();
            bw.write(100);
            bw.flush();
            bw.close();
        }
        catch (IOException e) {

        }
    }
}
