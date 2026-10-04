package corejava.part1.controlStatements.lab2;

import java.util.Scanner;

public class UberSurgeCheck {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rides = sc.nextInt();
        int threshold = sc.nextInt();
        int time = sc.nextInt();

        if (rides >= threshold && time < 24) {
            System.out.println("Surge Pricing ON");
        } else {
            System.out.println("Normal Pricing");
        }
    }
}
