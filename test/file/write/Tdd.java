import java.io.*;
import java.util.*;
public class Tdd {
    public static void main(String[] args) {
        try {
        	String name = "vishnu";
        	String age ="21";
            File file = new File("check.properties");
            //file.createNewFile();
            FileReader wb = new FileReader(file);
            Properties pro = new Properties();
            //wb.write("hello world\n");
            pro.load(wb);
            pro.setProperty("name","vishnu");
            pro.store(new FileWriter("check.properties"),null);
            

        }
        catch(Exception e) {

        }
    }
}
