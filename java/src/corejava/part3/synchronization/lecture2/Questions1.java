package corejava.part3.synchronization.lecture2;

public class Questions1 {

    static void main(String[] args) {

        MyFirstThread mft = new MyFirstThread();
        MySecondThread mst = new MySecondThread();
        mft.setName("Thread - 1 ");
        mst.setName("Thread - 2 ");

        mft.start();
        mst.start();

    }
}

class MyFirstThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.getName() + " : " + i);
        }
    }
}

class MySecondThread extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println(this.getName() + " : " + i);
        }
    }
}
