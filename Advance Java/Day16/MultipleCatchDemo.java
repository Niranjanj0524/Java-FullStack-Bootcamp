public class MultipleCatchDemo {
    public static void main(String[] args) {
        int arr[] = {10,23,12,33,0};
        try{
            int x = arr[5];
            System.out.println(x);

            int y = arr[1] / arr[4];
            System.out.println(y);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("---Array Index---" + e);
        }catch(ArithmeticException e){
            System.out.println("--Arithmetic Exception---" + e);
        }catch(Exception e){
            System.out.println("---Exception---" + e);
        }
    }
}
