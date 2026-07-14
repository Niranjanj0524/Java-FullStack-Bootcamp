package EMS.employee;

public abstract class Employee {
    private int empId;
    private String name;
    protected double baseSalary;

    public Employee(int empId, String name, double baseSalary){
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmpId(){
        return empId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public abstract void calculateSalary();
}
