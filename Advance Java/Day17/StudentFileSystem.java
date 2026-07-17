import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("\n--- Menu ---");
            System.out.println("1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No : ");
                    String rollNo = sc.nextLine();

                    try{
                        FileWriter fw = new FileWriter("students.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Roll No: " + rollNo + ", Name: " + name);
                        bw.newLine();
                        bw.close();
                        fw.close();
                        System.out.println("Student added successfully.");
                    } catch (IOException e) {
                        System.out.println("Error writing to file.");
                    }
                    break;

                case 2:
                     System.out.println("\n--- Student List ---");
                    try {
                        FileReader fr = new FileReader("students.txt");
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        boolean hasData = false;

                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                            hasData = true;
                        }
                        br.close();
                        fr.close();

                        if (!hasData) {
                            System.out.println("No records found.");
                        }
                    } catch (IOException e) {
                        System.out.println("No records found or file does not exist.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting system. Thank you!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
