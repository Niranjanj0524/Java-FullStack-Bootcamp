class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

public class CustomExceptionDemo {
    private double balance = 5000.0;

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Withdrawal failed : " + "Insufficent Balance in your Account");
        }else{
            balance -= amount;
            System.out.println("Withdrawal Successfull! -> " + " Remainig Amount : " + balance);
        }
    }

    public static void main(String[] args) {
        CustomExceptionDemo account = new CustomExceptionDemo();

        try{
            account.withdraw(2000.0);
        }catch(InsufficientBalanceException e){
            System.out.println("Exception Caught : " + e.getMessage());
        }
    }
}
