public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String gender;
    private String course;
    private double marks;

    public Student(int rollNO, String name, int age, String gender, String course, double marks){
        this.rollNo = rollNO;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void displayStudentDetails(){
        System.out.println("Roll No: " + rollNo + 
                           " | Name: " + name + 
                           " | Age: " + age + 
                           " | Gender: " + gender + 
                           " | Course: " + course + 
                           " | Marks: " + marks);
    }

}