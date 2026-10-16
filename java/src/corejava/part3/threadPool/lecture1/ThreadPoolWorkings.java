package corejava.part3.threadPool.lecture1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolWorkings {

    static void main(String[] args) {


        ExecutorService service = Executors.newScheduledThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            service.execute(new Task(i));
        }

        service.shutdown();

    }
}

class Task implements Runnable {
    int number;

    public Task(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing...!!! -> " + number);
    }
}
