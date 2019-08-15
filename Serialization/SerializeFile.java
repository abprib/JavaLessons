package Lesson8.Serialization;

import java.io.*;

public class SerializeFile {
    public static void main(String[] args) throws Exception {
        User user = new User(23,"Petr");

        //this object knows how to connect and create a file
        FileOutputStream fos = new FileOutputStream("tempFile");
        //Can write objects, but cant directly connect to files
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile");
        //Serialize objects to file
        oos.writeObject(user);
        oos.close();

        FileInputStream fis = new FileInputStream("tempFile");
        ObjectInputStream ois = new ObjectInputStream(fis);
        User newUser = (User) ois.readObject();
        ois.close();
        System.out.println(newUser.age + newUser.name);

        //.........Static fields don't serialize!
        //.........transient - NO serializable


    }
}
