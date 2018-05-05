import java.io.*;
public class Tdd {
    public static void main(String[] args) {

        try {
            File f = new File("abc.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("vishnu");
            bw.newLine();
            bw.write(100);
            bw.newLine();
            bw.flush();
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(f));
            String data = br.readLine();
            while(data != null) {
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {

        }
    }
}
