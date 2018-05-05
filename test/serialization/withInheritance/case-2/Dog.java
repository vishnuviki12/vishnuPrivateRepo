import java.io.*;
public class Dog extends Animal implements Serializable {
    int y = 20;

    public Dog() {
        System.out.println("dog constructor called");
    }
}
