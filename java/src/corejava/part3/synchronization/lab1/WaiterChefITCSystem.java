package corejava.part3.synchronization.lab1;

import java.util.Scanner;

public class WaiterChefITCSystem {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String restaurantName = sc.nextLine();
        String orderName = sc.nextLine();

        Restaurant restaurant = new Restaurant(restaurantName, orderName);
        Waiter waiter = new Waiter(restaurant);
        Chef chef = new Chef(restaurant);
        waiter.acceptOrder(orderName);

        waiter.start();
        chef.start();
    }
}

class Restaurant {
    private String name;
    private String order;
    boolean isOrderReady = false;

    public Restaurant(String name, String order) {
        this.name = name;
        this.order = order;
    }

    public synchronized void placeOrder(String orderName) throws InterruptedException {
        System.out.println("Welcome to " + name + " Restaurant!!!");
        System.out.println("Waiter: Placed order for " + orderName);
        wait();
        if (isOrderReady) {
            System.out.println("Waiter: Serving the " + orderName);
        }
    }

    public synchronized void prepareOrder() {
        System.out.println("Chef: Preparing " + order);
        System.out.println("Chef: " + order + " is ready!");
        isOrderReady = true;
        notify();
    }

    // Getters and Setters

    public String getName() {
        return name;
    }
}

class Waiter extends Thread {
    private Restaurant restaurant;
    private String orderName;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void acceptOrder(String orderName) {
        this.orderName = orderName;
    }

    public void run() {
        try {
            restaurant.placeOrder(orderName);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Chef extends Thread {
    private Restaurant restaurant;

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        restaurant.prepareOrder();
    }
}