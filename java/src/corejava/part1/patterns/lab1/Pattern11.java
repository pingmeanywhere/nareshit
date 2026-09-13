package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern11 {
    static void main(String[] args) {
        /*
            Que 12 : Write Java program to given pattern.
            1
            2   3
            4   5   6
            7   8   9   10
            11  12  13  14  15
            ===========================================
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
