package corejava.part3.collections.lecture5;

import java.util.Scanner;
import java.util.Vector;

public class SystemForBankAccountManagement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<BankAccount> bankAccounts = new Vector<>();

        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            int accountNumber = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            double balance = Double.parseDouble(sc.nextLine());

            bankAccounts.add(new BankAccount(accountNumber, name, balance));
        }

        BankAccount first = bankAccounts.get(0);
        first.deposit(2000);
        first.withdraw(500);
        first.displayAccount();

    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Amount of " + amount + " is deposited successfully");
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            System.out.println("Amount of " + amount + " has debited successfully");
            balance -= amount;
        } else {
            System.out.println("Insufficient amount for withdraw");
        }
    }

    public void displayAccount() {
        System.out.println("Ac. No  : " + accountNumber);
        System.out.println("Name    : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }
}