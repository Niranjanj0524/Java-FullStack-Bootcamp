import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu Driven Calculator
        while (true) {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter choice Number : ");
            int choice = sc.nextInt();
            
            if (choice == 5) {
                System.out.println("Exiting Calculator, GoodBye!");
                break;
            }
            
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please Select between 1-5.");
                continue;
            }
            
            System.out.print("Enter a first Number : ");
            double num1 = sc.nextDouble();
            System.out.print("Enter a second Number : ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                case 2 -> System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                case 3 -> System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                }
            }
        }
        sc.close();
    }
}
