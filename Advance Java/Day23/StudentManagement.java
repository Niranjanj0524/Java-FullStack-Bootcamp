import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "Student{RollNo=" + rollNo + ", Name='" + name + "', Marks=" + marks + "}";
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getMarks(), s2.getMarks());
    }
}

public class StudentManagement {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void sortByRollNo() {
        Collections.sort(students);
    }

    public void sortByName() {
        Collections.sort(students, new NameComparator());
    }

    public void sortByMarks() {
        Collections.sort(students, new MarksComparator());
    }

    public static void main(String[] args) {
        StudentManagement system = new StudentManagement();

        system.addStudent(new Student(103, "Charlie", 85));
        system.addStudent(new Student(101, "Alice", 92));
        system.addStudent(new Student(102, "Bob", 78));

        System.out.println("Initial List:");
        system.displayStudents();

        System.out.println("\nSorted by Roll No (Comparable):");
        system.sortByRollNo();
        system.displayStudents();

        System.out.println("\nSorted by Name (Comparator):");
        system.sortByName();
        system.displayStudents();

        System.out.println("\nSorted by Marks (Comparator):");
        system.sortByMarks();
        system.displayStudents();
    }
}
