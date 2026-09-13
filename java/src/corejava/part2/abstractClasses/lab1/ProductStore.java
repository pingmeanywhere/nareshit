package corejava.part2.abstractClasses.lab1;

import java.util.Scanner;

public class ProductStore {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = Integer.parseInt(sc.nextLine());

        String name = sc.nextLine();
        double price = Double.parseDouble(sc.nextLine());
        if (price < 0) {
            System.out.println("Error Invalid Input.");
            return;
        }
        String category = sc.nextLine();

        if (choice == 1) {
            String licenseKey = sc.nextLine();
            int discount = Integer.parseInt(sc.nextLine());
            DigitalProduct digitalProduct = new DigitalProduct(name, price, category, licenseKey);
            digitalProduct.displayDetails(discount);

        } else if (choice == 2) {
            double shippingWeight = Double.parseDouble(sc.nextLine());
            int discount = Integer.parseInt(sc.nextLine());

            PhysicalProduct physicalProduct = new PhysicalProduct(name, price, category, shippingWeight);
            physicalProduct.displayDetails(discount);

        }

    }
}


abstract class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public abstract double applyDiscount(double percentage);

    public abstract double calculateTax();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void displayDetails() {
        System.out.println("Product Name : " + this.getName());
        System.out.println("Category : " + this.getCategory());
        System.out.println("Price RS : " + this.getPrice());
    }
}


class DigitalProduct extends Product {

    private String licenseKey;

    public DigitalProduct(String name, double price, String category, String licenseKey) {
        super(name, price, category);
        this.licenseKey = licenseKey;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public double applyDiscount(double percentage) {
        return this.getPrice() * (percentage / 100.0);
    }

    public double calculateTax() {
        return this.getPrice() * 0.05;
    }

    public void displayDetails(double discount) {
        super.displayDetails();
        System.out.println("License Key : " + this.getLicenseKey());
        System.out.println("Discount : " + this.applyDiscount(discount));
        System.out.println("New Price : " + (this.getPrice() - this.applyDiscount(discount)));
        setPrice(this.getPrice() - applyDiscount(discount));
        System.out.println("Tax : " + this.calculateTax());
    }
}

class PhysicalProduct extends Product {

    private double shippingWeight;

    public PhysicalProduct(String name, double price, String category, double shippingWeight) {
        super(name, price, category);
        this.shippingWeight = shippingWeight;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public double applyDiscount(double percentage) {
        return this.getPrice() * (percentage / 100.0);
    }

    public double calculateTax() {
        return this.getPrice() * 0.08;
    }

    public double calculateShippingCost() {
        return this.getShippingWeight() * 5;
    }


    public void displayDetails(double discount) {
        super.displayDetails();
        System.out.println("Shipping Weight : " + this.getShippingWeight() + " KG");
        System.out.println("Discount : " + this.applyDiscount(discount));
        System.out.println("New Price : " + (this.getPrice() - this.applyDiscount(discount)));
        System.out.println("Tax : " + this.calculateTax());
        System.out.println("Shipping Cost : " + calculateShippingCost());
    }
}