import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Tdd {
    public static void main(String[] args) {
		try {
			File f1 = new File("a.txt");
            FileWriter fw = new FileWriter(f1);
            fw.write(65);
            fw.write("vishnu");
            fw.flush();

		}
		catch(IOException e) { }


    }
}
