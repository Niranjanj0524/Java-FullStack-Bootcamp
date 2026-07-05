import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Driving Eligibility
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            boolean isLicence = true;
            if (isLicence) {
                System.out.println("Eligible to Driving");
            }
        } else {
            System.out.println("Not eligible to driving");
        }
        System.out.println();

        // ATM PIN Verification
        System.out.print("ATM Inserted (true/false) : ");
        boolean atmInserted = sc.nextBoolean();

        int PIN = 1234;

        if (atmInserted == true) {
            System.out.print("Enter PIN : ");
            int enterPIN = sc.nextInt();

            if (PIN == enterPIN) {
                System.out.println("PIN is correct");
            } else {
                System.out.println("PIN not match, try again");
            }
        } else {
            System.out.println("Insert ATM");
        }
        System.out.println();

        //Login System
        String userName = "Niranjan0524";
        String Password = "Niranjan@0524";
        System.out.print("Enter User Name : ");
        String enterUserName = sc.next();
        
        if(userName.equals(enterUserName)){
            System.out.print("Enter Password : ");
            String enterPassword = sc.next();
            if(Password.equals(enterPassword)){
                System.out.println("Login Successfully " + userName);
            }else{
                System.out.println("Password is not match, try again");
            }
        }else{
            System.out.println("User Name is Not Found");
        }
    }
}
