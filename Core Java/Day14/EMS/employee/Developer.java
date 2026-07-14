package EMS.employee;

public class Developer extends Employee {
    private double bonus;

    public Developer(int empId, String name, double baseSalary, double bonus) {
        super(empId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println("Developer ID: " + getEmpId());
        System.out.println("Name: " + getName());
        System.out.println("Total Salary (Base + Bonus): ₹" + totalSalary);
        System.out.println("--------------------------------");
    }
}
