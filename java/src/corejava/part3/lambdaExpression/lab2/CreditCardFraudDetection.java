package corejava.part3.lambdaExpression.lab2;

import java.util.Scanner;
import java.util.function.Predicate;

public class CreditCardFraudDetection {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = Integer.parseInt(sc.nextLine().strip());
        boolean isInternational = Boolean.parseBoolean(sc.nextLine().strip());

        Transaction transaction = new Transaction(amount, isInternational);

        Predicate<Transaction> suspicious = o -> o.isInternational;

        if (suspicious.test(transaction)) {
            System.out.println("Suspicious Transaction");
        } else {
            System.out.println("Transaction Safe");
        }

    }
}

class Transaction {
    double amount;
    boolean isInternational;


    public Transaction(double amount, boolean isInternational) {
        this.amount = amount;
        this.isInternational = isInternational;
    }
}
