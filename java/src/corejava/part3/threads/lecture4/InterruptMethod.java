package corejava.part3.threads.lecture4;

public class InterruptMethod {

    static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.interrupt();
        myThread.start();


        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

    }
}

class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 101; i <= 200; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread : myThread got interrupted");
        }
    }
}