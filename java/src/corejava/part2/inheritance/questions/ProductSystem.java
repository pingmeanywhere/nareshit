package corejava.part2.inheritance.questions;

public class ProductSystem {

    static void main(String[] args) {

        DiscountProduct dprod = new DiscountProduct("Salt", 29.99, 2, 5);
        dprod.displayDetails();
        System.out.println(dprod.calculateTotal());
    }
}

class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Product Details : ");
        System.out.println("Name : " + this.name);
        System.out.println("Price : " + this.price);
        System.out.println("Quantity : " + this.quantity);
    }

    public double calculateTotal() {
        return (this.price * quantity);
    }
}


class DiscountProduct extends Product {
    public double discount;

    public DiscountProduct(String name, double price, int quantity, double discount) {
        super(name, price, quantity);
        this.discount = discount;
    }

    public double calculateTotal() {
        double total = super.calculateTotal();
        return (total - (total * discount) / 100);
    }
}




