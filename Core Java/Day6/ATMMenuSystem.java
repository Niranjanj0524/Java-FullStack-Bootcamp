import java.util.Scanner;

public class ATMMenuSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double balance = 5000.00; 

        while (true) {
            System.out.println("\n===== ATM SERVICES =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("\nThank you for using our ATM. Have a great day!");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option! Please select between 1 and 4.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.printf("Your current balance is: ₹%.2f\n", balance);
                }
                case 2 -> {
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    
                    if (depositAmount > 0) {
                        balance += depositAmount; 
                        System.out.printf("Successfully deposited! New Balance: ₹%.2f\n", balance);
                    } else {
                        System.out.println("Invalid amount! Deposit must be greater than zero.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    
                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount! Please enter a valid sum.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Transaction Failed: Insufficient Balance!");
                    } else {
                        balance -= withdrawAmount; 
                        System.out.printf("Please collect your cash. Remaining Balance: ₹%.2f\n", balance);
                    }
                }
            }
        }
        sc.close();
    }
}
