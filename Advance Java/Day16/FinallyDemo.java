public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
            System.out.println(data); 
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("finally block is always executed");
        }
    }
}
