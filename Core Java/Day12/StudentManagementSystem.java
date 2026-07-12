import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter Roll No: ");
                int rollNo = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();

                students[studentCount] = new Student(rollNo, name, age);
                studentCount++;
                System.out.println("Student added successfully!");

            } else if (choice == 2) {
                if (studentCount == 0) {
                    System.out.println("No students found!");
                } else {
                    System.out.println("\n--- Student List ---");
                    for (int i = 0; i < studentCount; i++) {
                        students[i].displayStudent();
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter Roll No to search: ");
                int searchRoll = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < studentCount; i++) {
                    if (students[i].rollNo == searchRoll) {
                        System.out.println("Student Found:");
                        students[i].displayStudent();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student with Roll No " + searchRoll + " not found.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting system. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
