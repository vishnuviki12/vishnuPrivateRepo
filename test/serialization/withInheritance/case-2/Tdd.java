import java.io.*;
public class Tdd {
    public static void main(String[] args) {
        try {
            Dog d1 = new Dog();
            d1.x = 100;
            d1.y = 200;
            FileOutputStream fos = new FileOutputStream("abc.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d1);
            oos.close();

            FileInputStream fis = new FileInputStream("abc.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog d2 = (Dog)ois.readObject();
            ois.close();

            System.out.println(d2.x+" - "+d2.y);
        } catch (Exception e) {

        }
    }
}
