package corejava.part2.polymorphism.lab1;

import java.util.Scanner;

public class CalculatorMultiply {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Calculator.multiply(a, b);
        } else if (choice == 2) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Calculator.multiply(a, b, c);
        }

    }
}


class Calculator {
    public static void multiply(int a, int b) {
        System.out.println(a + " x " + b + " = " + a * b);
    }

    public static void multiply(int a, int b, int c) {
        System.out.println(a + " x " + b + " x " + c + " = " + (a * b * c));
    }
}