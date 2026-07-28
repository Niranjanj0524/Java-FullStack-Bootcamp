import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}

public class StudentGroupingDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Amit", "IT"),
            new Student("Rahul", "CS"),
            new Student("Priya", "IT"),
            new Student("Sneha", "ECE"),
            new Student("Vikas", "CS")
        );

        Map<String, List<Student>> studentsByDept = students.stream()
            .collect(Collectors.groupingBy(Student::getDepartment));

        studentsByDept.forEach((dept, studentList) -> {
            System.out.println("Department: " + dept);
            System.out.println("Students: " + studentList);
            System.out.println();
        });
    }
}
