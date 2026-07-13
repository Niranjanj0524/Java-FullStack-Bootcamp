class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void displaySalary() {
        System.out.println(name + "'s Total Salary: Rs. " + baseSalary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary); 
        this.bonus = bonus;
    }

    @Override
    void displaySalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println("Manager " + name + "'s Total Salary (Base + Bonus): Rs. " + totalSalary);
    }
}

class Developer extends Employee {
    double allowance;

    Developer(String name, double baseSalary, double allowance) {
        super(name, baseSalary); 
        this.allowance = allowance;
    }

    @Override
    void displaySalary() {
        double totalSalary = baseSalary + allowance;
        System.out.println("Developer " + name + "'s Total Salary (Base + Allowance): Rs. " + totalSalary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Amit", 60000, 15000);
        Employee emp2 = new Developer("Rahul", 45000, 8000);

        emp1.displaySalary();
        emp2.displaySalary();
    }
}
