package corejava.part3.lambdaExpression.lab1;

import java.util.Scanner;

public class CustomSalaryEvaluator {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();

        SalaryRule sr = (value) -> value >= 50000 ? "High Salary" : "Normal Salary";
        System.out.println(sr.evaluate(salary));

    }
}

interface SalaryRule {
    String evaluate(double salary);
}
