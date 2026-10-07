package corejava.part3.exceptions.lecture1;

import java.util.Scanner;

public class BankAccountWithdrawalSimulation {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String accountHolder = sc.nextLine();
        double balance = sc.nextDouble();

        double amount = sc.nextDouble();

        BankAccount bankAccount = new BankAccount(accountHolder, balance);

        try {
            bankAccount.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > this.balance) {
            throw new InsufficientBalanceException("Insufficient balance in your account");
        }
        if (amount <= 0) {
            throw new InsufficientBalanceException("Invalid amount. Amount must be greater than 0");
        }

        this.balance = this.balance - amount;
        System.out.println(amount + " successfully debited from " + this.accountHolder + " account." +
                "\nRemaining balance: " + this.balance);

    }
}
