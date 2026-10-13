package corejava.part3.threads.lecture3;

public class DeadLockInThread {

    static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable(Thread.currentThread());
        Thread t1 = new Thread(myRunnable);
        t1.start();

        System.out.println("Waits for t1 to complete the execution;");
        t1.join();
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + " ");
        }
        System.out.println("Main got terminated");
    }
}
