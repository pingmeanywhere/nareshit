package corejava.part3.collections.lab3;

import java.util.Scanner;

public class AgeParserUsingValueOf {

    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        Integer age = Integer.valueOf(sc.nextLine());

        if (age >= 18) {
            System.out.println("Eligible for Voting");
        } else {
            System.out.println("Not Eligible for Voting");
        }
    }
}
