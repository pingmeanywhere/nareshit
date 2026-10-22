package corejava.part3.threads.lecture3;

public class YieldMethodInThreads {

    static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread");
        }


    }
}

class MyThread extends Thread {
    public void run() {

        try {
            for (int i = 1; i <= 100; i++) {
                Thread.yield();
                System.out.println(this.getName() + " : " + "Child Thread" + " State : " + this.getState());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
