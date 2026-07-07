import java.util.Scanner; 

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        
        //Print numbers from 1 to N
        for(int i = 1; i <= n; i++){ 
            System.out.println(i + " "); 
        } 
        
        //Print even and odd numbers between 1 and N
        for(int i = 0;i<=n;i++){
            if(i % 2 == 0){
                System.out.println("Even : " + i);
            }else{
                System.out.println("Odd : " + i);
            }
        }

        //Sum of N number
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        System.out.println("Sum of all n : " + sum);
        sc.close();
    }
}
