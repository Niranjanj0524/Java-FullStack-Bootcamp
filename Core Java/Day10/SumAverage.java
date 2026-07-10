public class SumAverage {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int sumArr = 0;
        for(int i = 0; i < arr.length; i++){
            sumArr += arr[i];
        }
        System.out.println("Sum of arr : " + sumArr);
        System.out.println("Average of arr : " + sumArr/arr.length);
    }
}
