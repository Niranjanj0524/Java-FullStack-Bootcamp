import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Student implements Comparable<Student>{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other){
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString(){
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }
}

public class StudentComparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Niranjan", 50));
        students.add(new Student(4, "Yash", 88));
        students.add(new Student(3, "Nandini", 70));
        students.add(new Student(2, "Ira", 60));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nAfter Sorting by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
