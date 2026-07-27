class Join1 extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Join2 extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hii : " + i);
            try {
                sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Join1 t1 = new Join1();
        Join2 t2 = new Join2();

        t1.start();
        t2.join();
        t2.start();
    }
}
