public class ThrowDemo {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old");
        } else {
            System.out.println("Access granted - Age is valid");
        }
    }
    public static void main(String[] args) {
         try {
            validateAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
