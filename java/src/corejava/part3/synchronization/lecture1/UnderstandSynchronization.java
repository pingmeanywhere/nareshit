package corejava.part3.synchronization.lecture1;

public class UnderstandSynchronization {

    static void main(String[] args) {

        WhatsApp wa = new WhatsApp();

        MyThread t1 = new MyThread(wa, "John");
        MyThread t2 = new MyThread(wa, "Don");
        t1.start();
        t2.start();


    }
}

class MyThread extends Thread {
    public WhatsApp wa;
    public String message;

    public MyThread(WhatsApp wa, String message) {
        this.wa = wa;
        this.message = message;
    }

    public void run() {
        wa.sendMessage(message);
    }
}

class WhatsApp {
    public synchronized void sendMessage(String name) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " -> Good morning...!!");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
