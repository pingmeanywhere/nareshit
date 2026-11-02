package corejava.part3.collections.lecture8;

import java.util.Vector;

public class VectorSyncDemonstrate {

    static void main(String[] args) throws InterruptedException {
        Vector<Integer> v = new Vector<>();


        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    v.add(i);
//                    System.out.println("HI : " + i);
//                    Thread.sleep(500);
                }
                System.out.println(v);
                System.out.println(Thread.currentThread().getName() + " finished to add elements.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    v.add(i);
//                    System.out.println("HELLO : " + i);
//                    Thread.sleep(500);
                }
                System.out.println(v);
                System.out.println(Thread.currentThread().getName() + " finished to add elements.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    v.add(i);
//                    System.out.println("BYE : " + i);
//                    Thread.sleep(500);
                }
                System.out.println(v);
                System.out.println(Thread.currentThread().getName() + " finished to add elements.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println(v);
        System.out.println("Main Terminated");

    }
}

