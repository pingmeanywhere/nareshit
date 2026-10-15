package corejava.part3.threads.lecture5;

public class DaemonThread {

    static void main(String[] args) {
        DThread dt = new DThread();
        dt.setDaemon(true);
        dt.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main : " + i);
        }

    }
}


class DThread extends Thread {
    public void run() {
        for (int i = 101; i <= 1000; i++) {
            System.out.println("ND Thread : " + i);
        }
    }

}