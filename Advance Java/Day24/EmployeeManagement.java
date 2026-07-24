import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Name : " + name + "Salary : " + salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        HashMap<Integer, Employee> empMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Empolyee Id : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Salary : ");
                    double salary = sc.nextDouble();

                    empMap.put(id, new Employee(name, salary));
                    System.out.println("Empolyee Added Successfully");
                    break;

                case 2 :
                    System.out.print("Enter Employee Id to Search : ");
                    int searchId = sc.nextInt();

                    if(empMap.containsKey(searchId)){
                         System.out.println("Employee Found -> ID: " + searchId + " | " + empMap.get(searchId));
                    }else{
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 3 : 
                    System.out.print("Enter Employee Id to Remove : ");
                    int removeId = sc.nextInt();
                    
                    if(empMap.containsKey(removeId)){
                        empMap.remove(removeId);
                        System.out.println("Employee Removed Successfully");
                    }else{
                        System.out.println("Employee ID does not exist.");
                    }
                    break;

                case 4 :
                    if (empMap.isEmpty()) {
                        System.out.println("The list is empty. No employees found.");
                    } else {
                        System.out.println("\n--- All Employees List ---");
                        for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
                            System.out.println("ID: " + entry.getKey() + " | " + entry.getValue());
                        }
                    }
                    break;

                case 5 :
                    System.out.println("Exiting program. Thank you!");
                    sc.close();
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 5.");
            }
        }

    }
}
