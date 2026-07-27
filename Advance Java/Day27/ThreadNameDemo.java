class RunnableTask implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Task is executing in: " + threadName);
    }
}

public class ThreadNameDemo {
    public static void main(String[] args) {
        Runnable task1 = new RunnableTask();
        Runnable task2 = new RunnableTask();
        Runnable task3 = new RunnableTask();

        Thread thread1 = new Thread(task1, "Alpha-Thread");
        Thread thread2 = new Thread(task2, "Beta-Thread");
        Thread thread3 = new Thread(task3, "Gamma-Thread");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}