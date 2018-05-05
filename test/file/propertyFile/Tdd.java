import java.io.*;
import java.util.*;
public class Tdd {
    public static void main(String[] args) {
        try {
            File file = new File("test.properties");
            Properties properties = new Properties();
            FileReader fr = new FileReader(file);
            properties.load(fr);
            System.out.println(properties.getProperty("name"));
            System.out.println(properties.getProperty("age"));
            System.out.println(properties.getProperty("job"));
            System.out.println(properties.getProperty("malayalam"));
            System.out.println(properties.getProperty("director"));
            System.out.println(properties.getProperty("scene"));
            System.out.println(properties.getProperty("hero"));
            System.out.println(properties.getProperty("heroin"));
            System.out.println(properties.getProperty("villian"));
            System.out.println(properties.getProperty("comedian"));
            System.out.println(properties.getProperty("filmType"));
            System.out.println(properties.getProperty("comedy"));
            System.out.println(properties.getProperty("romantic"));
            System.out.println(properties.getProperty("thriller"));
            System.out.println(properties.getProperty("dialogNo"));


        }
        catch(Exception e) {

        }
    }
}
