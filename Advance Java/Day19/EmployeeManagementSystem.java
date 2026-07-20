import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name to add: ");
                    String newEmp = scanner.nextLine();
                    employees.add(newEmp);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found to update.");
                    } else {
                        System.out.println("Current Employees:");
                        for (int i = 0; i < employees.size(); i++) {
                            System.out.println(i + ". " + employees.get(i));
                        }
                        System.out.print("Enter employee index to update: ");
                        int updateIndex = scanner.nextInt();
                        scanner.nextLine(); 

                        if (updateIndex >= 0 && updateIndex < employees.size()) {
                            System.out.print("Enter new name: ");
                            String updatedName = scanner.nextLine();
                            employees.set(updateIndex, updatedName);
                            System.out.println("Employee updated successfully!");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;

                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found to delete.");
                    } else {
                        System.out.println("Current Employees:");
                        for (int i = 0; i < employees.size(); i++) {
                            System.out.println(i + ". " + employees.get(i));
                        }
                        System.out.print("Enter employee index to delete: ");
                        int deleteIndex = scanner.nextInt();
                        scanner.nextLine(); 

                        if (deleteIndex >= 0 && deleteIndex < employees.size()) {
                            employees.remove(deleteIndex);
                            System.out.println("Employee deleted successfully!");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;

                case 4:
                    if (employees.isEmpty()) {
                        System.out.println("No employees to display.");
                    } else {
                        System.out.println("\nEmployee List:");
                        for (int i = 0; i < employees.size(); i++) {
                            System.out.println((i + 1) + ". " + employees.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
