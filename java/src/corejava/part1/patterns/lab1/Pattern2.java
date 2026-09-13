package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern2 {

    static void main(String[] args) {
        /*
            Que 2 : Write Java program to given pattern.
            5  4  3  2  1
            5  4  3  2  1
            5  4  3  2  1
            5  4  3  2  1
            5  4  3  2  1
            ========================================================
        */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
