package corejava.part3.collections.lecture13;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class OnlineShoppingManagement {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();


        while (true) {
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter id, name , price and quantity");
                    cart.addProduct(new Product(Integer.parseInt(sc.nextLine()), sc.nextLine(),
                            Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine())));
                }
                case 2 -> {
                    System.out.println("Enter product id to remove : ");
                    cart.removeProduct(Integer.parseInt(sc.nextLine()));
                }
                case 3 -> {
                    System.out.println(cart.calculateTotalAmount());;
                }
                case 4 -> {
                    cart.displayCart();
                }
                default -> {
                    break;
                }

            }
        }

    }
}

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    LinkedHashMap<Integer, Product> cart;

    public ShoppingCart() {
        this.cart = new LinkedHashMap<>();
    }

    public void addProduct(Product p) {
        if (!cart.containsKey(p.getId())) {
            cart.put(p.getId(), p);
            System.out.println("Product added");
        } else {
            cart.get(p.getId()).setQuantity(
                    cart.get(p.getId()).getQuantity() + p.getQuantity());
            System.out.println("Product updated");
        }
    }

    public void removeProduct(int id) {
        if (cart.containsKey(id)) {
            cart.remove(id);
            System.out.println("Product remove with id : " + id);
        } else {
            System.out.println("Product not found with id : " + id);
        }
    }

    public double calculateTotalAmount() {
        double total = 0;

        for (Product p : cart.values()) {
            total += p.getPrice() * p.getQuantity();
        }

        return total;
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Shopping cart is empty");
        } else {
            for (Product p : cart.values()) {
                System.out.println(p);
            }
        }
    }
}
