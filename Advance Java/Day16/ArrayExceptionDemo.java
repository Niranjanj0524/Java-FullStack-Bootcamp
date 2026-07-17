public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        try{
            int x = arr[0];
            int y = arr[5];
            System.out.println(x);
            System.out.println(y);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("---Index Bound---" + e);
        }catch(ArithmeticException e){
            System.out.println("--Arithmetic Exception " + e);
        }
        System.out.println(arr[3]);
    }
}
