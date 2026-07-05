import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        // Grade Calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade: A (Very Good)");
        } else if (marks >= 50 && marks < 75) {
            System.out.println("Grade: B (Good)");
        } else if (marks >= 35 && marks < 50) {
            System.out.println("Grade: C (Pass)");
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Error: Invalid marks entered!");
        }
        System.out.println();

        //Income Tax Slab
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();

        if (income <= 250000) {
            System.out.println("Tax Rate: 0% (No Tax)");
        } else if (income > 250000 && income <= 500000) {
            System.out.println("Tax Rate: 5%");
        } else if (income > 500000 && income <= 1000000) {
            System.out.println("Tax Rate: 20%");
        } else {
            System.out.println("Tax Rate: 30%");
        }
    }
}
