package corejava.part2.polymorphism.lab1;

import java.util.Scanner;

public class TaxCalculation {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1) {
            int income = sc.nextInt();

            System.out.println("Income: " + income + " | Tax Rate: 10% | Tax: "
                    + Finance.calculateTax(income));

        } else if (choice == 2) {
            double income = sc.nextDouble();
            System.out.println("Income: " + income + " | Tax Rate: 12.5% | Tax: "
                    + Finance.calculateTax(income));
        } else {
            System.out.println("Invalid choice!");
        }

    }
}

class Finance {

    public static double calculateTax(int income) {
        return (double) (income * 10) / 100;
    }

    public static double calculateTax(double income) {
        return income * 12.5 / 100.0;
    }

}
