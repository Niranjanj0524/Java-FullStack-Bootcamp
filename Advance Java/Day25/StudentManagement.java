enum Branch{
    CSE, IT, ECE, MECH,
}

class Student{
    private int id;
    private String name;
    private Branch branch;

    public Student(int id, String name, Branch branch){
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString(){
        return "Student ID: " + id + ", Name: " + name + ", Branch: " + branch;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student[] students = {
            new Student(101, "Niranjan", Branch.CSE),
            new Student(102, "Varad", Branch.IT),
            new Student(103, "Vivek", Branch.ECE),
            new Student(104, "Atharva", Branch.MECH)
        };

        for(Student student : students){
            System.out.println(student);
        }
    }
}
