package corejava.part3.collections.lecture17;

import java.util.Scanner;
import java.util.function.Predicate;

public class IncompleteOrders {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().trim());

        Order[] orders = new Order[size];

        for (int i = 0; i < orders.length; i++) {
            orders[i] = new Order(sc.nextLine(), Boolean.parseBoolean(sc.nextLine()));
        }

        Predicate<Order> shipped = Order::isShipped;
        Predicate<Order> notShipped = shipped.negate();

        System.out.println("Unshipped Orders:");
        for (Order o : orders) {
            if (notShipped.test(o)) {
                System.out.println(o.getId());
            }
        }
    }
}

class Order {
    private String id;
    private boolean shipped;


    public Order(String id, boolean shipped) {
        this.id = id;
        this.shipped = shipped;
    }

    public String getId() {
        return id;
    }

    public boolean isShipped() {
        return shipped;
    }
}