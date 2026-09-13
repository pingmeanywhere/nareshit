package corejava.part2.encapsulation.lab1;

import java.util.Scanner;

public class ProductClassDesign {


    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);

        String laptop = sc.nextLine();
        if(laptop.isEmpty()) {
            System.out.println("ERROR");
            return;
        }

        int price = Integer.parseInt(sc.nextLine());
        if(price  <= 0) {
            System.out.println("ERROR");
            return;
        }

        String category = sc.nextLine();
        if(category.isEmpty()) {
            System.out.println("ERROR");
            return;
        }


        Product pd = new Product(laptop, price, category);
        pd.displayDetails();


    }
}


class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        if (price > 0) {
            this.price = price;
        }
        if (!category.isEmpty()) {
            this.category = category;
        }
    }


    public void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("Name : " + this.name);
        System.out.println("Price  : " + this.price);
        System.out.println("Category  : " + this.category);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getCategory() {
        return this.category;
    }
}