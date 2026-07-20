import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    transient String password;

    Student(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class TransientDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Rahul", "secret123");
            FileOutputStream fout = new FileOutputStream("transient.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.close();

            FileInputStream fin = new FileInputStream("transient.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student s2 = (Student) in.readObject();
            in.close();

            System.out.println("Name: " + s2.name);
            System.out.println("Password: " + s2.password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
