import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<Student> studentsList = new ArrayList<>();
    
    public void addStudent(Scanner sc){
        System.out.print("Enter Roll No : ");
        int roll = sc.nextInt();
        sc.nextLine();

        for(Student s : studentsList){
            if(s.getRollNo() == roll){
                System.out.println("❌ Error: A student with Roll Number " + roll + " already exists.");
                return;
            }
        }

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender : ");
        String gender = sc.nextLine();

        System.out.print("Enter Course : ");
        String course = sc.nextLine();

        System.out.print("Enter marks : ");
        double marks = sc.nextDouble();

        studentsList.add(new Student(roll, name, age, gender, course, marks));
        System.out.println("✅ Student added successfully!");
    }

    public void viewAllStudents(){
        if(studentsList.isEmpty()){
            System.out.println("⚠️ No students found in the system.");
            return;
        }
        System.out.println("---Student Records---");
        for(Student s : studentsList){
            s.displayStudentDetails();
        }
    }

    public void searchStudent(Scanner sc){
        System.out.print("Enter Roll NO to Search : ");
        int roll = sc.nextInt();

        for(Student s : studentsList){
            if(s.getRollNo() == roll){
                System.out.println("🔍 Student Found:");
                s.displayStudentDetails();
                return;
            }
        }
        System.out.println("❌ Student with Roll Number " + roll + " not found.");
    }

    public void updateStudent(Scanner sc){
        int roll = sc.nextInt();
        sc.nextLine();

        for(Student s : studentsList){
            if(s.getRollNo() == roll){
            System.out.print("Enter New Name : ");
            s.setName(sc.nextLine());

            System.out.print("Enter New Age : ");
            s.setAge(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter New Gender : ");
            s.setGender(sc.nextLine());

            System.out.print("Enter New Course : ");
            s.setCourse(sc.nextLine());

            System.out.print("Enter New Marks : ");
            s.setMarks(sc.nextDouble());

            System.out.println("✅ Student details updated successfully!");
            return;
        }
        }
    }

    public void deleteStudent(Scanner sc){
        System.out.print("Enter Roll No to Delete : ");
        int roll = sc.nextInt();
        
        for(int i = 0; i < studentsList.size(); i++){
            if(studentsList.get(i).getRollNo() == roll){
                studentsList.remove(i);
                System.out.println("🗑️ Student record deleted successfully!");
                return;
            }
        }
        System.out.println("❌ Student with Roll Number " + roll + " not found.");
    }

    public void displayCount(){
        System.out.println("📊 Total students in system: " + studentsList.size());
    }
}