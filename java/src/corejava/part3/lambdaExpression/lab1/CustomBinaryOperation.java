package corejava.part3.lambdaExpression.lab1;

import java.util.Scanner;

public class CustomBinaryOperation {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        BinaryOperation bo = null;
        if (choice == 1) {
            bo = (a, b) -> a + b;
        } else if (choice == 2) {
            bo = (a, b) -> a * b;
        }

        System.out.println("Result = " + bo.operate(num1, num2));

    }
}

interface BinaryOperation {
    int operate(int a, int b);
}
