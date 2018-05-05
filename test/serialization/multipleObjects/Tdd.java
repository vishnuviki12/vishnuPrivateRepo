import java.io.*;
public class Tdd {
    public static void main(String[] args) throws Exception {

        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Rat r1 = new Rat();

        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.writeObject(c1);
        oos.writeObject(r1);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();
        Cat c2 = (Cat)ois.readObject();
        Rat r2 = (Rat)ois.readObject();

        System.out.println(d2.name+" "+d2.age);
        System.out.println(c2.name+" "+c2.age);
        System.out.println(r2.name+" "+r2.age);

    }
}
