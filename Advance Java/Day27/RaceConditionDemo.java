class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Worker implements Runnable {
    private Counter counter;

    public Worker(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new Worker(counter));
        Thread thread2 = new Thread(new Worker(counter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Expected count: 2000");
        System.out.println("Actual count: " + counter.getCount());
    }
}