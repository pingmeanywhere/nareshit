package corejava.part3.lambdaExpression.lab2;

import java.util.Scanner;
import java.util.function.Predicate;

public class BankLoanEligibility {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = Integer.parseInt(sc.nextLine().strip());
        int creditScore = Integer.parseInt(sc.nextLine().strip());

        Customer customer = new Customer(salary, creditScore);

        Predicate<Customer> predicate = p -> p.salary >= 25000 && p.creditScore >= 700;

        if (predicate.test(customer)) {
            System.out.println("Eligible for Loan");
        } else {
            System.out.println("Not Eligible for Loan");
        }
    }
}

class Customer {
    int salary;
    int creditScore;


    public Customer(int salary, int creditScore) {
        this.salary = salary;
        this.creditScore = creditScore;
    }
}