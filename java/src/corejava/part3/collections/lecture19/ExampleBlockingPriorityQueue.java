package corejava.part3.collections.lecture19;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class ExampleBlockingPriorityQueue {

    static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Producer Adding : " + i);
                queue.put(i);
                try {
                    Thread.sleep(2000);
                } catch (Exception _) {

                }
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Consumer Removing : " + queue.take());
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("Consumer Terminated");
            }
        });
        consumer.start();
        producer.start();
        producer.join();
        consumer.join();

        System.out.println("QUEUE : " + queue);
    }
}
