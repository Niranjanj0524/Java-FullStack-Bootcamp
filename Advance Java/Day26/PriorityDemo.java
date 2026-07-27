class PriorityThread extends Thread{
    public PriorityThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread Name: " + Thread.currentThread().getName() + " | Priority: " + Thread.currentThread().getPriority());
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Low-Priority-Thread");
        PriorityThread t2 = new PriorityThread("Normal-Priority-Thread");
        PriorityThread t3 = new PriorityThread("High-Priority-Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
