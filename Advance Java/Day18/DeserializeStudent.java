import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    int id;
    String name;
}

public class DeserializeStudent {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fin);

            Student s = (Student) in.readObject();
            System.out.println(s.id + " " + s.name);
            in.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
