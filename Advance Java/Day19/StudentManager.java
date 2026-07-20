import java.util.ArrayList;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Niranjan");
        students.add("Yash");
        students.add("Nandini");
        students.add("Ira");

        System.out.println("Displaying all student names:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("Total number of students: " + students.size());
    }
}
