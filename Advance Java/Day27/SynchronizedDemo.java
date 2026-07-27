class Counter {
    private int count = 0;

    public synchronized void increment() {
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

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Worker(counter));
        Thread t2 = new Thread(new Worker(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected count: 2000");
        System.out.println("Actual count: " + counter.getCount());
    }
}