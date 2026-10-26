package corejava.part3.lambdaExpression.lab1;

import java.util.Scanner;

public class CustomELCChainedHelper {

    static int validate(FirstStage fs, int n) {
        return fs.test(n);
    }

    static int validate(SecondStage fs, int n) {
        return fs.test(n);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        FirstStage fs = (value) -> value * 2;
        SecondStage ss = (value) -> value + 5;

        System.out.println("Final Result = " + validate(ss, (validate(fs, n))));

    }
}

interface FirstStage {
    int test(int value);
}

interface SecondStage {
    int test(int value);
}

