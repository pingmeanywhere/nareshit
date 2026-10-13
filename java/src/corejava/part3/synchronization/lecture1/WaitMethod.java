package corejava.part3.synchronization.lecture1;

public class WaitMethod {

    static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        t1.start();

        try {
            System.out.println("Waiting for t1 to reach 150");
            synchronized (t1) {
                t1.wait();
            }

            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println(i);

            if (i == 150) {
                synchronized (this) {
                    System.out.println("T thread nofigies th4e waiting thread  main");
                    notify();
                }
            }
        }
    }
}
