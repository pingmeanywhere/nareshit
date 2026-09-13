package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern6 {

    static void main(String[] args) {
        /*
            Que 7 :  Write Java program to given pattern.
            1   2   3   4   5
            10  9   8   7   6
            11  12  13  14  15
            20  19  18  17  16
            =====================================
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i % 2 != 0) {
                    System.out.print((count++) + " ");
                } else {
                    System.out.print((n * i) - j + 1 + " ");
                    count = (n * i) + 1;
                }
            }
            System.out.println();
        }
    }
}
