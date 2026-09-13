package corejava.part2.hasAObject;

public class Aggregation {

    static void main(String[] args) {
        Customer c1 = new Customer("Saiman", "Fixed", 2300);
        Customer c2 = new Customer("Arya", "Fixed", 4000);
        Customer c3 = new Customer("Dua", "Savings", 12000);

        Bank bank = new Bank("HDFC", "Hyderabad", c1, c2, c3);
        bank.displayDetails();
    }
}


class Bank {
    String name;
    String place;
    Customer customer1;
    Customer customer2;
    Customer customer3;

    public Bank(String name, String place, Customer customer1, Customer customer2, Customer customer3) {
        this.name = name;
        this.place = place;
        this.customer1 = customer1;
        this.customer2 = customer2;
        this.customer3 = customer3;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Place" + this.place);
        System.out.println("Customer --------------- 1");
        customer1.displayDetails();
        System.out.println("Customer --------------- 2");
        customer2.displayDetails();
        System.out.println("Customer --------------- 3");
        customer3.displayDetails();
    }
}

class Customer {
    String name;
    String accType;
    double balance;

    public Customer(String name, String accType, double balance) {
        this.name = name;
        this.accType = accType;
        this.balance = balance;
    }


    public void displayDetails() {
        System.out.println("Customer Name : " + this.name);
        System.out.println("Account Type : " + accType);
        System.out.println("Balance : " + this.balance);
    }
}