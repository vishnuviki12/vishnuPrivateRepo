import java.io.*;
public class Account implements Serializable {
    String name = "vishnu";
    transient String password = "vishnu12";
    transient int balance = 100;

    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        os.writeObject(this.password);
        os.writeInt(this.balance);
    }

    private void readObject(ObjectInputStream is) throws Exception {
        is.defaultReadObject();
        this.password = (String)is.readObject();
        this.balance = (int)is.readInt();
    }
}
