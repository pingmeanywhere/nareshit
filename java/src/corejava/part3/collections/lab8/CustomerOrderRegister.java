package corejava.part3.collections.lab8;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CustomerOrderRegister {

    static void main(String[] args) {

        Shop shop = new Shop();

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < size; i++) {
            shop.addOrder(new Order(Integer.parseInt(sc.nextLine().trim()), sc.nextLine().trim()));
        }

        int searchId = Integer.parseInt(sc.nextLine().trim());
        shop.displayOrders();
        shop.searchOrder(searchId);

    }
}


class Order {
    int id;
    String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

class Shop {
    LinkedHashMap<Integer, Order> orders;

    public Shop() {
        orders = new LinkedHashMap<>();
    }

    public void addOrder(Order order) {
        if (orders.containsKey(order.id)) {
            orders.put(order.id, order);
        } else {
            orders.put(order.id, order);
        }
    }

    public void displayOrders() {
        System.out.println("Order List");
        for (Order o : orders.values()) {
            System.out.println(o);
        }
    }

    public void searchOrder(int id) {
        if (id <= 0) {
            System.out.println("Order id must be greater than 0");
        } else if (orders.containsKey(id)) {
            System.out.println("Order Found: " + orders.get(id));
        } else {
            System.out.println("Order Not Found");
        }
    }
}