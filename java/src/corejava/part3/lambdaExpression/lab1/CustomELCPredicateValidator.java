package corejava.part3.lambdaExpression.lab1;

import java.util.Scanner;
import java.util.function.Predicate;

public class CustomELCPredicateValidator {

    static void validate(int age, AgeRule ar) {
        if (ar.validate(age)) {
            System.out.println("Valid Age");
        } else {
            System.out.println("Invalid Age");
        }
    }


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        Predicate<Integer> p = (value) -> value >= 18;

        AgeRule ar = p::test;

        validate(age, ar);


    }
}

interface AgeRule {
    boolean validate(int age);
}
