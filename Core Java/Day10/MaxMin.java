import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int arr[] = {3,5,1,22,66,7,2};
        Arrays.sort(arr);
        System.out.println("Min value : " + arr[0]);
        System.out.println("Max value : " + arr[arr.length-1]);

        int min = arr[0];
        int max = arr[0];
        
        for(int i=0;i<arr.length;i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.println("Min using for loop : " + min);
        System.out.println("Max using for loop : " + max);
    }
}
