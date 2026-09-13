package corejava.part2.abstraction;

import java.util.Scanner;

public class AbstractionOverview {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Payment payment = PaymentFactory.getPaymentObject(n);

        LoanService loanService = new LoanService();
        loanService.clearLoad(payment, 50000);
    }
}

class PaymentFactory {
    static Payment getPaymentObject(int choice) {
        return switch (choice) {
            case 1 -> new UPIPayment();
            case 2 -> new CreditCardPayment();
            case 3 -> new CryptoPayment();
            default -> null;
        };
    }
}

class LoanService {
    void clearLoad(Payment payment, double amount) {
        if (payment.pay(amount)) {
            System.out.println("Loan cleared successfully");
            System.out.println("Loan clearance certificate generated");
        } else {
            System.out.println("Payment Failed!!! Loan not cleared");
        }
    }
}

interface Payment {
    boolean pay(double amount);
}

class UPIPayment implements Payment {
    public boolean pay(double amount) {
        System.out.println("Payment of " + amount + "  done using UPI.");
        return true;
    }
}

class CreditCardPayment implements Payment {
    public boolean pay(double amount) {
        System.out.println("Payment of " + amount + " done using Credit Card.");
        return true;
    }
}

class CryptoPayment implements Payment {
    public boolean pay(double amount) {
        System.out.println("Payment of " + amount + " done using Crypto Currency.");
        return true;
    }
}
