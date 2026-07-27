import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> sumTask = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        Future<Integer> futureResult = executor.submit(sumTask);

        try {
            System.out.println("Waiting for the result...");
            Integer finalSum = futureResult.get();
            System.out.println("The sum of numbers 1 to 100 is: " + finalSum);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
