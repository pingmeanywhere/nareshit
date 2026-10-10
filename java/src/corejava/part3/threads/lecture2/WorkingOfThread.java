package corejava.part3.threads.lecture2;

public class WorkingOfThread {

    static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        Thread newThread = new Thread(new PrintHello());
        newThread.start();

        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }


        System.out.println("Main Method Exit");


    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 51; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}

class PrintHello implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("HELLO");
        }
    }
}
