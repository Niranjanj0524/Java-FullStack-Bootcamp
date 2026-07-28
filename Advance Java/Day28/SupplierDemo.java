import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Integer> randomSupplier = () -> random.nextInt(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Random Number " + (i + 1) + ": " + randomSupplier.get());
        }
    }
}
