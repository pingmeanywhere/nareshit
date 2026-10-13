package corejava.part2.polymorphism.lab1;

import java.util.Scanner;

public class BankAccountManagementSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isChecked = false;
        int count = 0;
        int n = 3;
        while (n > 0) {

            int choice = Integer.parseInt(sc.nextLine().trim());
            String accountHolder = sc.nextLine();

            // If the constructor choice is 1
            if (choice == 1) {
                count++;
                int deposit = Integer.parseInt(sc.nextLine().trim());
                int withdrawal = Integer.parseInt(sc.nextLine().trim());
                isChecked = true;
                Account account = new Account(accountHolder);
                account.deposit(deposit);
                account.withdraw(withdrawal);
                if(withdrawal > deposit) {
                    System.out.println("Insufficient balance.");
                }
                System.out.println("Account " + count + " Details:");
                account.printAccountDetails();
            }
            if (choice == 2) {
                count++;
                int balance = Integer.parseInt(sc.nextLine().trim());
                int deposit = Integer.parseInt(sc.nextLine().trim());
                int withdrawal = Integer.parseInt(sc.nextLine().trim());
                isChecked = true;

                Account account = new Account(accountHolder, balance);
                account.deposit(deposit);
                account.withdraw(withdrawal);
                System.out.println("Account " + count + " Details:");
                account.printAccountDetails();
            }
            if (choice == 3) {
                count++;
                int balance = Integer.parseInt(sc.nextLine().trim());
                String accountType = sc.nextLine();
                int deposit = Integer.parseInt(sc.nextLine().trim());
                int withdrawal = Integer.parseInt(sc.nextLine().trim());
                isChecked = true;
                Account account = new Account(accountHolder, balance, accountType);
                account.deposit(deposit);
                account.withdraw(withdrawal);
                System.out.println("Account " + count + " Details:");
                account.printAccountDetails();
            }

            n--;
        }

    }
}


class Account {
    private String accountHolderName;
    private double balance;
    private String accountType;

    public Account(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0;
        this.accountType = "Savings";
    }

    public Account(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = "Savings";
    }

    public Account(String accountHolderName, double balance, String accountType) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > this.balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        this.balance = this.balance - amount;

    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: " + this.balance);
    }

}