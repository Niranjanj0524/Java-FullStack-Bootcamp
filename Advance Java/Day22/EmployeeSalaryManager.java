import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeSalaryManager {
    private Map<Integer, Double> employeeMap;

    public EmployeeSalaryManager() {
        employeeMap = new LinkedHashMap<>();
    }

    public void addEmployee(int empId, double salary) {
        if (employeeMap.containsKey(empId)) {
            System.out.println("Employee ID " + empId + " already exists.");
        } else {
            employeeMap.put(empId, salary);
            System.out.println("Employee added successfully.");
        }
    }

    public void searchEmployee(int empId) {
        if (employeeMap.containsKey(empId)) {
            System.out.println("Employee ID: " + empId + ", Salary: " + employeeMap.get(empId));
        } else {
            System.out.println("Employee ID " + empId + " not found.");
        }
    }

    public void removeEmployee(int empId) {
        if (employeeMap.containsKey(empId)) {
            employeeMap.remove(empId);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee ID " + empId + " not found.");
        }
    }

    public void displayEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }
        System.out.println("--- Employee Records (Insertion Order) ---");
        for (Map.Entry<Integer, Double> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Salary: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        EmployeeSalaryManager manager = new EmployeeSalaryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*** Employee Menu ***");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    manager.addEmployee(id, salary);
                    break;
                case 2:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = scanner.nextInt();
                    manager.searchEmployee(searchId);
                    break;
                case 3:
                    System.out.print("Enter Employee ID to Remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeEmployee(removeId);
                    break;
                case 4:
                    manager.displayEmployees();
                    break;
                case 5:
                    System.out.println("Exiting Employee Manager.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
