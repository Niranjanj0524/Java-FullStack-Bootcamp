import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter array of index : " + i + " : ");
            nums[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.println("Array index : "+ i + " : " + nums[i]);
        }

        sc.close();
    }
}