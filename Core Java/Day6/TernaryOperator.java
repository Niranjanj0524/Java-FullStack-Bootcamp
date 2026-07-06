import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Maximum of Three Numbers (nested ternary)
        while (true) {
            System.out.println("\n--- Find Maximum Number ---");
            System.out.print("Enter 1st number (or enter 000 to exit): ");
            int a = sc.nextInt();
            if (a == 000)
                break;

            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            System.out.print("Enter 3rd number: ");
            int c = sc.nextInt();

            int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

            System.out.println("The maximum number is: " + max);
        }
        System.out.println();

        // Character is Uppercase or Lowercase
        while (true) {
            System.out.print("\nEnter a character (or enter '0' to exit): ");
            char ch = sc.next().charAt(0);

            if (ch == '0') {
                System.out.println("Exiting Program. Goodbye!");
                break;
            }

            String result = (ch >= 'A' && ch <= 'Z') ? "UPPERCASE letter"
                    : (ch >= 'a' && ch <= 'z') ? "lowercase letter"
                            : (ch >= '0' && ch <= '9') ? "Digit"
                                    : "Special Character";

            System.out.println("➔ '" + ch + "' is a " + result + ".");
        }

        sc.close();
    }
}
