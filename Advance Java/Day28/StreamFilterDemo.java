import java.util.Arrays;
import java.util.List;

public class StreamFilterDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 55, 34, 78, 5, 89, 23, 50, 91);

        System.out.println("Even Numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        System.out.println("Numbers greater than 50:");
        numbers.stream()
               .filter(n -> n > 50)
               .forEach(System.out::println);
    }
}
