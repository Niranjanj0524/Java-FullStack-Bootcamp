import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("student.txt");
            FileOutputStream out = new FileOutputStream("copy.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            in.close();
            out.close();
            System.out.println("File Copied Successfully");
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
