import java.io.*;
public class Tdd {
    public static void main(String[] args) throws Exception {

        Dog g = new Dog();
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(g);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d = (Dog)ois.readObject();

        System.out.println(d.name+" "+d.age);

    }
}
