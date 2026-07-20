import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Students implements Serializable{
    private static final long serialVersionUid = 1L;
    int id;
    String name;

    Students(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class SerializeStudent {
    public static void main(String[] args) {
        try{
            Students s1 = new Students(1, "Nianjan");

            FileOutputStream fout = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}