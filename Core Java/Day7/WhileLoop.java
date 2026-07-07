import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Reverse Number
        int n = sc.nextInt();

        int reverse = 0;
        
        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10; 
        }
        
        System.out.println(reverse);
        sc.close();
    }
}
