import java.util.Random;
import java.util.TreeSet;

public class TreeSetDemo {
     public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        Random random = new Random();

        while (numbers.size() < 10) {
            numbers.add(random.nextInt(100));
        }

        System.out.println("Sorted numbers: " + numbers);
    }
}
