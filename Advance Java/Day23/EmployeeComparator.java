import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

public class EmployeeComparator {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Charlie", 50000));
        employees.add(new Employee(2, "Alice", 60000));
        employees.add(new Employee(3, "Bob", 55000));

        System.out.println("Before Sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees, new NameComparator());

        System.out.println("\nAfter Sorting Alphabetically by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
