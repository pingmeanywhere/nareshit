package corejava.part2.encapsulation.practice;

import java.util.Scanner;

public class BankAccountDetails {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int accountNumber = Integer.parseInt(sc.nextLine());
        String accountHolderName = sc.nextLine();
        double deposit = Double.parseDouble(sc.nextLine());


        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountHolderName(accountHolderName);
        bankAccount.setAccountNumber(accountNumber);

        bankAccount.deposit(deposit);

        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Account Holder Name: " + bankAccount.getAccountHolderName());
        System.out.println("Balance: " + bankAccount.getBalance());


    }

}


class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;


    // Getting and Setting balanace variable


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance = amount;
        }
    }

    // Getting and setting account number


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        }
    }

    // Getting and settting account holder name

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}