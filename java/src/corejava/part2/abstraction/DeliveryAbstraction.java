package corejava.part2.abstraction;

import java.util.Scanner;

public class DeliveryAbstraction {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        String item = sc.nextLine();

        DeliveryPartner deliveryPartner = OrderFactory.createOrder(choice);

        OrderService.placeOrder(deliveryPartner, item);


    }
}


class OrderFactory {
    public static DeliveryPartner createOrder(int choice) {
        return switch (choice) {
            case 1 -> new SwiggyDelivery();
            case 2 -> new ZomatoDelivery();
            case 3 -> new ZeptoDelivery();
            default -> null;
        };
    }
}


class OrderService {
    public static void placeOrder(DeliveryPartner deliveryPartner, String item) {
        if (deliveryPartner.deliverOrder(item)) {
            System.out.println("Order Delivered Successfully, Item : " + item);
        } else {
            System.out.println("Failed to deliver order on your location");
        }
    }
}


interface DeliveryPartner {
    boolean deliverOrder(String item);
}

class SwiggyDelivery implements DeliveryPartner {

    public boolean deliverOrder(String item) {
        System.out.println("Item to deliver : " + item + " via Swiggy");
        return true;
    }
}

class ZomatoDelivery implements DeliveryPartner {

    public boolean deliverOrder(String item) {
        System.out.println("Item to deliver : " + item + " via Zomato");
        return true;
    }
}

class ZeptoDelivery implements DeliveryPartner {

    public boolean deliverOrder(String item) {
        System.out.println("Item to deliver : " + item + " via Zepto");
        return true;
    }
}




