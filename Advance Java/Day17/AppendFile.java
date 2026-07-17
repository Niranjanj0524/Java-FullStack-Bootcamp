import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {
    public static void main(String[] args) {
        File myFile = new File("student.txt");
        
        try {
            FileWriter writer = new FileWriter(myFile, true);
            writer.write("\nThis is appended text.");
            writer.close();
            
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
