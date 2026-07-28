import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("amit", "rahul", "priya", "sneha");

        Function<String, String> convertToUppercase = name -> name.toUpperCase();

        for (String name : names) {
            String uppercaseName = convertToUppercase.apply(name);
            System.out.println("Original: " + name + " -> Uppercase: " + uppercaseName);
        }
    }
}
