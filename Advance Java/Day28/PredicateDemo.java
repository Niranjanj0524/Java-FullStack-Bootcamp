import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        int testNumber = 14;

        if (isEven.test(testNumber)) {
            System.out.println(testNumber + " is even number");
        } else {
            System.out.println(testNumber + " is odd number");
        }
    }
}
