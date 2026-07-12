public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accNo, String name, double initialBalance) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Success! Deposited: " + amount + " Rs.");
        } else {
            System.out.println("Error: Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Success! Withdrew: " + amount + " Rs.");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            System.out.println("Error: Invalid withdrawal amount!");
        }
    }

    public void displayBalance() {
        System.out.println("-------------------------------------");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance + " Rs.");
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("987654321", "Niranjan", 5000.0);

        myAccount.displayBalance();

        myAccount.deposit(2000.0);
        myAccount.displayBalance();

        myAccount.withdraw(1500.0);
        myAccount.displayBalance();

        myAccount.withdraw(6000.0);
    }
}
