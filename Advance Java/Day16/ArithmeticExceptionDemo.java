public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
       int i = 10;
       int j = 1;
       try{
          j = i / 0;
       }catch(ArithmeticException e){
          System.out.println("--Arithmetic Exception-- " + e);
       }
       System.out.println(i);
       System.out.println(j);

    }
}