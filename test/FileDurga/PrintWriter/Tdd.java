import java.io.*;
public class Tdd {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("abc.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.write(100);
            pw.write("\n");
            pw.print(100);
            pw.print("\n");
            pw.println("vishnu");
            pw.flush();
            pw.close();

            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
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
