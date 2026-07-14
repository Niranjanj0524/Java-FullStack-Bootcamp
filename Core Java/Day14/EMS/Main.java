import EMS.employee.Employee;
import EMS.employee.Developer;

public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer(101, "Rahul Sharma", 50000, 15000);
        
        System.out.println("--- Employee Management System ---");
        dev.calculateSalary();
    }
}
