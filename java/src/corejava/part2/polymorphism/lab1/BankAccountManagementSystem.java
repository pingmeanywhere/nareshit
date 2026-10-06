package corejava.part2.polymorphism.lab1;

import java.util.Scanner;

public class BankAccountManagementSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();



    }
}


class Account {
    private String accountHolderName;
    private double balance;
    private String accountType;

    public Account(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0;
        this.accountType = "Saving";
    }

    public Account(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = "Saving";
    }

    public Account(String accountHolderName, double balance, String accountType) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > this.balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        this.balance = this.balance - amount;

    }

    public  void printAccountDetails() {
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Account Type: Savings" + this.accountType);
        System.out.println("Balance: " + this.balance);
    }

}