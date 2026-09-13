package corejava.part2.encapsulation.questions;

public class Question1 {

    static void main(String[] args) {

    }
}


class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public double withdraw(double balance) {
        if (this.balance >= balance && balance > 0) {
            return this.balance - balance;
        } else {
            System.out.println("Insufficient or Invalid balance entered");
        }

        return  0;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class  MobileApp extends  BankAccount {

    public MobileApp(String accountNumber, double balance) {
        super(accountNumber, balance);
    }


    public double withdraw(double balance) {
        if(balance > 250000) {
            System.out.println("Limit exceed for mobile");
            return -1;
        };
        return super.withdraw(balance);
    }
}
