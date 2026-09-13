package corejava.part2.inheritance.lab1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class CreditCardLimitApproval {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int annualIncome = sc.nextInt();
        int creditScore = sc.nextInt();

        CreditCard creditCard = new CreditCard(annualIncome, creditScore);

        creditCard.displayLimit();

    }
}

class Customer {
    private double annualIncome;
    private double creditScore;

    public Customer(double annualIncome, double creditScore) {
        this.annualIncome = annualIncome;
        this.creditScore = creditScore;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public double getCreditScore() {
        return creditScore;
    }
}


class CreditCard extends Customer {
    public CreditCard(double annualIncome, double creditScore) {
        super(annualIncome, creditScore);
    }

    public double calculateCreditCardLimit() {
        if (this.getAnnualIncome() >= 500000 && this.getCreditScore() >= 750) {
            return 500000;
        }
        if (this.getAnnualIncome() >= 400000 && this.getCreditScore() >= 700) {
            return 200000;
        }
        if (this.getAnnualIncome() >= 300000 && this.getCreditScore() >= 650) {
            return 100000;
        }
        return 0;
    }

    public void displayLimit() {
        int limit = (int) this.calculateCreditCardLimit();
        if (limit != 0) {
            System.out.println("Limit: " + limit);
        } else {
            System.out.println("Rejected");
        }
    }
}