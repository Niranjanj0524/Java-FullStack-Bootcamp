import java.io.FileReader;
import java.io.IOException;

public class ReadWithFileReader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("student.txt");
            int ch;
            
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch); 
            }
            reader.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
