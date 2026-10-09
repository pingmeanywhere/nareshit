package corejava.part3.exceptions.lab2;

import java.util.Scanner;

public class SalaryProcessingPipeline {

    static void calculateGross(int baseSalary, int bonus) throws SalaryCalculationException {
        calculateTax(baseSalary, bonus);
    }

    static void calculateTax(int baseSalary, int bonus) throws SalaryCalculationException {
        generatePayslip(baseSalary, bonus);
    }

    static void generatePayslip(int baseSalary, int bonus) throws SalaryCalculationException {
        if (baseSalary < 0 || bonus < 0) {
            throw new SalaryCalculationException("Error: Invalid salary data");
        }

        System.out.println("Payslip generated");

    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baseSalary = sc.nextInt();
        int bonus = sc.nextInt();

        try {
            calculateGross(baseSalary, bonus);
        } catch (SalaryCalculationException e) {
            System.out.println(e.getMessage());
        }
    }
}

class SalaryCalculationException extends Exception {
    SalaryCalculationException(String message) {
        super(message);
    }
}
