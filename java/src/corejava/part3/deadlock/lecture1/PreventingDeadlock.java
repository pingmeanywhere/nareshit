package corejava.part3.deadlock.lecture1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PreventingDeadlock {


    static void main(String[] args) {

        Lock l = new ReentrantLock();

        MyThread t1 = new MyThread(l);
        MyThread t2 = new MyThread(l);

        t1.start();
        t2.start();

        System.out.println("Main Terminated");

    }
}


class MyThread extends Thread {

    public Lock l;

    public MyThread(Lock l) {
        this.l = l;
    }

    public void run() {
        if (l.tryLock()) {
            try {
                l.lock();
                System.out.println(this.getName() + " is acquired the lock");
                for (int i = 1; i <= 5; i++) {
                    System.out.println(this.getName() + " : " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println(this.getName() + " lock released");
                l.unlock();
            }
        } else {
            System.out.println(this.getName() + " couldn't lock because lock is not released");
        }
    }
}
