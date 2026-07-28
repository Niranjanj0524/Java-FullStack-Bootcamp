import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class EmployeeStreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Amit", 45000),
            new Employee("Rahul", 65000),
            new Employee("Priya", 55000),
            new Employee("Sneha", 48000),
            new Employee("Vikas", 75000)
        );

        List<Employee> filteredAndSortedEmployees = employees.stream()
            .filter(emp -> emp.getSalary() > 50000)
            .sorted((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
            .collect(Collectors.toList());

        filteredAndSortedEmployees.forEach(System.out::println);
    }
}
