import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        Random random = new Random();

        numbers.offer(random.nextInt(100));
        numbers.offer(random.nextInt(100));
        numbers.offer(random.nextInt(100));
        numbers.offer(random.nextInt(100));
        numbers.offer(random.nextInt(100));

        System.out.print("Removed elements (Sorted Order): ");
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }
        System.out.println();
    }
}
