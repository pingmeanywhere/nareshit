package corejava.part3.threads.lecture3;

public class ThreadJoinMethods {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable(Thread.currentThread());
        Thread t1 = new Thread(myRunnable);
        t1.start();


        try {
            System.out.println("Main waits for t1 to terminate");
            t1.join();
            for (int i = 0; i <= 100; i++) {
                System.out.println(i + " ");
            }
            System.out.println("Main got terminated");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        /*
      try {
            System.out.println("Main waits for t1 to terminate");
            t1.join();
            for (int i = 0; i <= 100; i++) {
                System.out.println(i + " ");
            }
            System.out.println("Main got terminated");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */

    }
}

class MyRunnable implements Runnable {
    Thread mt;

    MyRunnable(Thread mt) {
        this.mt = mt;
    }

    public void run() {


        for (int i = 101; i <= 200; i++) {
            System.out.println(i + " ");
        }
        System.out.println("T1 got terminated");


    }
}
