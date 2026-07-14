class BankAcc{
    private double balance;

    public BankAcc(double initialBalance){
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }else{
            this.balance = 0;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount deposited successfully " + amount);
        }else{
            System.out.println("error, amount must be greather than zero ");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("amount withdraw successfully " + amount);
        }else if(amount > balance){
            System.out.println("Low balance in account : " + balance);
        }else{
            System.out.println("withdraw amount will be greater than zero");
        }
    }

}

public class BankAccount {
    public static void main(String[] args) {
        BankAcc account = new BankAcc(1000);

        System.out.println("Initial balance : " + account.getBalance());

        account.deposit(500);
        System.out.println("Updated balance : " + account.getBalance());

        account.withdraw(300);
        System.out.println("updated balance : " + account.getBalance());

        account.withdraw(2000);
    }
}
