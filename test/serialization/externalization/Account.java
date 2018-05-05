import java.io.*;
public class Account implements Externalizable {
    String name = "vishnu";
    int age = 22;
    int no = 12;

    public void writeExternal(ObjectOutput oo) throws IOException {
        oo.writeObject(name);
        oo.writeInt(age);

    }

    public void readExternal(ObjectInput oi) throws IOException {
        this.name = (String)oi.readObject();
        this.age = oi.readInt();
    }
}
