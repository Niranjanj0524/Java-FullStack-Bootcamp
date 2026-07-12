public class Employee {
    int empId;
    String empName;
    double empSalary;
    public Employee(){
        System.out.println("New Employee");
    }
    public void displayEmpInfo(){
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Salary : " + empSalary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.empId = 1;
        emp.empName = "Niranjan";
        emp.empSalary = 1250000.00;

        emp.displayEmpInfo();

        Employee emp1 = new Employee();

        emp1 .empId = 2;
        emp1.empName = "Yash";
        emp1.empSalary = 10000.0;

        emp1.displayEmpInfo();

    }
}
