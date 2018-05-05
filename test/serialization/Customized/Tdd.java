import java.io.*;
public class Tdd {
    public static void main(String[] args) {
        try {
            Account a = new Account();
            FileOutputStream fos = new FileOutputStream("abc.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.close();

            FileInputStream fis = new FileInputStream("abc.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a = (Account)ois.readObject();
            ois.close();
            System.out.println(a.password+"..."+a.balance);
        } catch (Exception e) {

        }

    }
}
