class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Runnable : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable myObj = new MyRunnable();
        Thread t1 = new Thread(myObj);
        t1.start();
    }
}
