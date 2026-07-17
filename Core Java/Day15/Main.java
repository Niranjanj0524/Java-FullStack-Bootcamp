import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        int choice;

        System.out.println("=== Welcome to the Student Management System ===");
        do{
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Update Student Details");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Student Count");
            System.out.println("7. Exit");
            System.out.print("Please enter your choice (1-7): ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sms.addStudent(sc);
                    break;

                case 2:
                    sms.viewAllStudents();;
                    break;

                case 3:
                    sms.searchStudent(sc);;
                    break;

                case 4:
                    sms.updateStudent(sc);
                    break;

                case 5:
                    sms.deleteStudent(sc);
                    break;

                case 6:
                    sms.displayCount();;
                    break;

                case 7:
                    System.out.println("👋 Exiting system... Goodbye!");
                    break;

                default:
                    System.out.println("⚠️ Invalid Choice! Please enter a number between 1 and 7.");

            }
        }while(choice != 7);

        sc.close();
    }
}