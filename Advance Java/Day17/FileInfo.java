import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        File myFile = new File("student.txt");
        try {
            myFile.createNewFile();

            FileWriter writer = new FileWriter("student.txt");
            writer.write("This is my first file in the java course.");
            writer.close(); 
            
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close(); 
            
        } catch (IOException e) {
            System.out.println("Cannot handle file operations");
            e.printStackTrace();
        }

         if (myFile.exists()) {
            System.out.println("Name: " + myFile.getName());
            System.out.println("Path: " + myFile.getAbsolutePath());
            System.out.println("Size: " + myFile.length() + " bytes");
            System.out.println("Exists?: Yes");
            System.out.println("Readable?: " + (myFile.canRead() ? "Yes" : "No"));
            System.out.println("Writable?: " + (myFile.canWrite() ? "Yes" : "No"));
        } else {
            System.out.println("File does not exist.");
        }
    }
}
