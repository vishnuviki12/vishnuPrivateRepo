import java.io.*;
import java.util.*;
public class Control {
    String name = "vishnu";
    int age = 21;

    public void save() {
        try {
            File file = new File("check.properties");
            FileReader fr = new FileReader(file);
            Properties pro = new Properties();
            pro.load(fr);
            pro.setProperty("name",this.name);
            pro.store(new FileWriter("check.properties"),null);
            String a = Integer.toString(this.age);
            pro.setProperty("age",a);
            pro.store(new FileWriter("check.properties"),null);

        }

        catch(Exception e) {

        }


    }
}
