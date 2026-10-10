package corejava.part3.threads.lecture2;

public class BetterExtendingClass {

    static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }

        System.out.println("Main Method Exit");
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 51; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
