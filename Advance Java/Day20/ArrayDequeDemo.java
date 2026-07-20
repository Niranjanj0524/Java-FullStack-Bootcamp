import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Middle");
        System.out.println("Added front: " + deque);

        deque.addLast("Rear");
        System.out.println("Added rear: " + deque);

        deque.addFirst("Front");
        System.out.println("Added front: " + deque);

        deque.removeFirst();
        System.out.println("Removed front: " + deque);

        deque.removeLast();
        System.out.println("Removed rear: " + deque);
    }
}
