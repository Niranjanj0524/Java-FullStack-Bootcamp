import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarksSystem{
    private Map<Integer, String> studentMap;

    public StudentMarksSystem(){
        studentMap = new HashMap<>();
    }

    public void addStudent(int rollNo, String name){
        if(studentMap.containsKey(rollNo)){
            System.out.println("Roll No : " + rollNo + "Already Exist.");
        }else{
            studentMap.put(rollNo, name);
            System.out.println("Student added successfully");
        }
    }

    public void searchStudent(int rollNo){
        if(studentMap.containsKey(rollNo)){
            System.out.println("Student Found : " + studentMap.get(rollNo));
        }else{
            System.out.println("Roll No : " + rollNo + " Not Found.");
        }
    }

    public void removeStudent(int rollNo){
        if(studentMap.containsKey(rollNo)){
            String removeStudent = studentMap.remove(rollNo);
            System.out.println("Removed student: " + removeStudent);
        }else{
            System.out.println("Roll Number " + rollNo + " not found.");
        }
    }

    public void displayStudents(){
        if(studentMap.isEmpty()){
            System.out.println("No student record available.");
            return;
        }
        System.out.println("---Student Records---");
        for(Map.Entry<Integer, String> entry : studentMap.entrySet()){
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentMarksSystem system = new StudentMarksSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*** Student Menu ***");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    system.addStudent(roll, name);
                    break;
                case 2:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = scanner.nextInt();
                    system.searchStudent(searchRoll);
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Remove: ");
                    int removeRoll = scanner.nextInt();
                    system.removeStudent(removeRoll);
                    break;
                case 4:
                    system.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
