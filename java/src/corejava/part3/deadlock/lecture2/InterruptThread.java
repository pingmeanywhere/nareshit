package corejava.part3.deadlock.lecture2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InterruptThread {

    static void main(String[] args) {

        Lock l = new ReentrantLock();
        MyThread t1 = new MyThread(l);
        MyThread t2 = new MyThread(l);

        t1.start();
        t2.start();

        try {
            System.out.println("Main thread waits 5 second for t1 to release");
            Thread.sleep(5000);
            if (t1.getState() == Thread.State.WAITING) {
                t1.interrupt();
            } else {
                t2.interrupt();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted the waiting thread after 5 sec");
        }


    }
}

class MyThread extends Thread {

    public Lock l;

    public MyThread(Lock l) {
        this.l = l;
    }

    public void run() {
        try {
            l.lockInterruptibly();
            System.out.println(this.getName() + " is acquired the lock");
            for (int i = 1; i <= 10; i++) {
                System.out.println(this.getName() + " : " + i);
                Thread.sleep(1000);
            }
            System.out.println(this.getName() + " released the lock");
            l.unlock();
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " is interrupted !!!..");
        }
    }
}
