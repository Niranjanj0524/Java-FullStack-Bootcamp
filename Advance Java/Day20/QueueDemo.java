import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.offer("Niranjan");
        myQueue.offer("Yash");
        myQueue.offer("Nandini");
        myQueue.offer("Ira");
        myQueue.offer("abc");

        myQueue.poll();

        System.out.println("Front element: " + myQueue.peek());

        System.out.println("Queue size: " + myQueue.size());
    }
}
