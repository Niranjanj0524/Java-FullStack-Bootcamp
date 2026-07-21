import java.util.HashSet;
import java.util.Scanner;

public class StudentRegistrationSystem {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n*** Student Registration System ***");
            System.out.println("1. Register Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to register: ");
                    String nameToRegister = scanner.nextLine();
                    if (students.add(nameToRegister)) {
                        System.out.println("Student registered successfully.");
                    } else {
                        System.out.println("Error: Student already exists.");
                    }
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students registered yet.");
                    } else {
                        System.out.println("Registered Students:");
                        for (String student : students) {
                            System.out.println("- " + student);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String nameToSearch = scanner.nextLine();
                    if (students.contains(nameToSearch)) {
                        System.out.println("Student found in the system.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (students.remove(nameToRemove)) {
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found in the records.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
