package corejava.part3.synchronization.lecture2;

public class DeadLockInWait {

    private static MyThread1 t1;

    static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        t1.start();

        Thread.sleep(5000);
        System.out.println("Waiting for the t1 thread to notify then main will start...");
        synchronized (t1) {
            t1.wait();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }
}


class MyThread1 extends Thread {
    public void run() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);

            if (i == 15) {
                synchronized (this) {
                    System.out.println("T thread notifies the waiting thread  main");
                    notify();
                }
            }
        }
    }
}
