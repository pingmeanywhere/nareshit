package corejava.part3.exceptions.lab2;

import java.util.Scanner;

public class BankTransactionSystem {

    static void validate(int balance, int amount) throws InsufficientBalanceException {
        process(balance, amount);
    }

    static void process(int balance, int amount) throws InsufficientBalanceException {
        debit(balance, amount);
    }

    static void debit(int balance, int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Error: Insufficient balance");
        }
        System.out.println("Withdrawal successful");
    }


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount = sc.nextInt();

        try {
            process(balance, amount);
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