package corejava.part3.synchronization.lecture1;

public class BoundedWarehouseTest {
    static void main(String[] args) throws InterruptedException {
        Warehouse warehouse = new Warehouse(5); // Max capacity = 5

        // Create multiple producers and consumers
        Producer p1 = new Producer(warehouse, "Producer-1");
        Producer p2 = new Producer(warehouse, "Producer-2");
        Consumer c1 = new Consumer(warehouse, "Consumer-1");
        Consumer c2 = new Consumer(warehouse, "Consumer-2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();

        p1.join();
        p2.join();
        c1.join();
        c2.join();

        System.out.println("All production and consumption completed!");
    }
}

class Warehouse {
    private int currentItems = 0;
    private final int capacity;

    public Warehouse(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(String producerName) throws InterruptedException {
        while (currentItems == capacity) {
            System.out.println("Where house is full. Please wait for...");
            wait();
        }
        currentItems++;
        System.out.println(producerName + " got the place in the where house. Items : "
                + currentItems + "\n");
        notifyAll();
    }

    public synchronized void consume(String consumerName) throws InterruptedException {
        while (currentItems == 0) {
            System.out.println("Where house is empty. Please wait for the producer to enter...");
            wait();
        }
        currentItems--;
        System.out.println(consumerName + " consumed the where house. Now items are : "
                + currentItems + "\n");
        notifyAll();
    }
}

class Producer extends Thread {
    Warehouse warehouse;
    String name;

    public Producer(Warehouse warehouse, String name) {
        this.warehouse = warehouse;
        this.name = name;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                warehouse.produce(name);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    Warehouse warehouse;
    String name;

    public Consumer(Warehouse warehouse, String name) {
        this.warehouse = warehouse;
        this.name = name;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                warehouse.consume(name);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
