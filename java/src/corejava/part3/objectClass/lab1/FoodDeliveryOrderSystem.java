package corejava.part3.objectClass.lab1;

import java.util.Scanner;

public class FoodDeliveryOrderSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String restaurantName = sc.nextLine();
        String city = sc.nextLine();
        String orderId = sc.nextLine();
        double foodAmount = Double.parseDouble(sc.nextLine());
        double deliveryFee = Double.parseDouble(sc.nextLine());

        DeliveryOrder deliveryOrder = new DeliveryOrder(restaurantName, city, orderId,
                foodAmount, deliveryFee);
        System.out.println(deliveryOrder.toString());

    }
}

class Restaurant {
    String restaurantName;
    String city;

    public Restaurant(String restaurantName, String city) {
        this.restaurantName = restaurantName;
        this.city = city;
    }

    public String toString() {
        return "Restaurant: " + this.restaurantName + "\nCity: " + this.city;
    }
}

class FoodOrder extends Restaurant {
    String orderId;
    double foodAmount;

    public FoodOrder(String restaurantName, String city, String orderId, double foodAmount) {
        super(restaurantName, city);
        this.orderId = orderId;
        this.foodAmount = foodAmount;
    }

    public String toString() {
        return super.toString() + "\nOrder ID: " + this.orderId + "\nFood Amount: " + this.foodAmount;
    }
}

class DeliveryOrder extends FoodOrder {
    double deliveryFee;

    public DeliveryOrder(String restaurantName, String city, String orderId, double foodAmount,
                         double deliveryFee) {
        super(restaurantName, city, orderId, foodAmount);
        this.deliveryFee = deliveryFee;
    }

    public String toString() {
        return super.toString() + "\nDelivery Fee: " + this.deliveryFee +
                "\nTotal Amount: " + this.calculateTotalAmount();
    }

    double calculateTotalAmount() {
        return foodAmount + deliveryFee;
    }
}

