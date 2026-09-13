package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern10 {
    static void main(String[] args) {
        /*
            Que 11 :  Write Java program to given pattern.
            *
            *  *
            *  *  *
            *  *  *  *
            *  *  *  *  *

            ============================================
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
