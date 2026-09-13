package corejava.part2.methods.lecture5;

import java.util.Scanner;

public class Question2 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and initial balance here : ");
        String name = sc.nextLine();
        double initialAmount = sc.nextDouble();


        BankAccount user = new BankAccount(name,
                "SBI" + Math.round(Math.random() * 10000000), initialAmount);
        user.displayBalance();;


    }
}


class  BankAccount {
    public  String accountHolderName;
    public  String accountNumber;
    public  double balance;


    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public  void deposit(double balance) {
        this.balance = this.balance + balance;
    }
    public  void withdraw(double balance) {
        if(balance > this.balance) {
            System.out.println("Insufficient balance");
            return;
        }
        this.balance = this.balance - balance;
    }

    public  void displayBalance () {
        System.out.println("Name : " + this.accountHolderName);
        System.out.println("AC No. : " + this.accountNumber);
        System.out.println("Your balance : " + this.balance);
    }
}