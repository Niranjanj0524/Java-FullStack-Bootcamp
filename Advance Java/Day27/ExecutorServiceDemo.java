import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("Task " + taskId + " is executed by " + threadName);
                }
            });
        }

        executor.shutdown();
    }
}
