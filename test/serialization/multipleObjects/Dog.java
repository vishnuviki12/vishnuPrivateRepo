import java.io.*;
public class Dog implements Serializable {
    String name = "dumbroo";
    transient final int age = 10;
}
