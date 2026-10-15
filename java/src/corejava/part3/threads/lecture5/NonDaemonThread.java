package corejava.part3.threads.lecture5;

public class NonDaemonThread {

    static void main(String[] args) {

        NDThread nd = new NDThread();

        nd.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main : " + i);
        }

    }
}


class NDThread extends Thread {
    public void run() {
        for (int i = 101; i <= 1000; i++) {
            System.out.println("ND Thread : " + i);
        }
    }
}