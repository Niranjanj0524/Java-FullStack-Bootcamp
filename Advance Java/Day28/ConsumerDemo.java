import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Amit", "Rahul", "Priya", "Sneha");

        Consumer<String> printName = name -> System.out.println("Employee Name: " + name);

        employeeNames.forEach(printName);
    }
}
