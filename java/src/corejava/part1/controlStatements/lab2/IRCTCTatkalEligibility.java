package corejava.part1.controlStatements.lab2;

import java.util.Scanner;

public class IRCTCTatkalEligibility {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int current = sc.nextInt();

        if (days <= 2 && current <= 5) {
            System.out.println("Tatkal Allowed");
        } else {
            System.out.println("Not Allowed");
        }

    }
}
