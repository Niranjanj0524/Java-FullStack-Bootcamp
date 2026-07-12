public class Student {
    String name;
    int age;
    int rollNo;
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("RollNo : " + rollNo);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Niranjan";
        obj.age = 21;
        obj.rollNo = 54;

        obj.display();
    }
}