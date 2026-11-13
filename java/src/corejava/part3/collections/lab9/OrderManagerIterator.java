package corejava.part3.collections.lab9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OrderManagerIterator {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().trim());

        OrderManager om = new OrderManager();

        for (int i = 0; i < size; i++) {
            String word = sc.nextLine();
            if (word.length() > 30) {
                System.out.println("Error - Order name too long");
                return;
            }
            om.addOrder(word);
        }
        String removable = sc.nextLine();
        om.removeOrder(removable);
        om.displayOrders();

    }
}


class OrderManager {
    ArrayList<String> orders;


    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(String orderName) {
        orders.add(orderName);
    }

    public void removeOrder(String orderName) {
        orders.remove(orderName);
    }

    public void displayOrders() {
        Iterator<String> it = orders.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}