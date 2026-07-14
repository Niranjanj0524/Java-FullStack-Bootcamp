class StudentDetails {
    private int rollNumber;
    private String name;
    private double marks;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

}


public class Student {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails();

        student.setRollNumber(1);
        student.setName("Niranjan");
        student.setMarks(88.5);

        System.out.println("Student Details:");
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
    }
}
