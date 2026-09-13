package corejava.part2.inheritance.lab2;

import java.util.Scanner;

public class BankCustomerInfo {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();

        switch (choice) {
            case 1 -> {
                new Customer(name).display();
            }
            case 2 -> {
                int loyaltyPoints = Integer.parseInt(sc.nextLine());
                new PremiumCustomer(name, loyaltyPoints).display();
            }
            case 3 -> {
                String name2 = sc.nextLine();
                int loyaltyPoints = Integer.parseInt(sc.nextLine());
                new Customer(name).display();
                new PremiumCustomer(name2, loyaltyPoints).display();
            }
            default -> {
            }
        }


    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void display() {
        System.out.println("Customer Details: ");
        System.out.println("Name: " + this.getName());
    }

}

class PremiumCustomer extends Customer {
    private int loyaltyPoints;

    public PremiumCustomer(String name, int loyaltyPoints) {
        super(name);
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }


    public void display() {
        System.out.println("Premium Customer Details: ");
        System.out.println("Name: " + this.getName());
        System.out.println("Loyalty Points: " + this.getLoyaltyPoints());
    }
}