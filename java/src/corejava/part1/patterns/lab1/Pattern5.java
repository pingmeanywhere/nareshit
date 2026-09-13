package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern5 {
    static void main(String[] args) {
        /*
            Que 6 : Write Java program to given pattern.
            1   2   3   4   5
            2   4   6   8   10
            3   6   9   12  15
            4   8   12  16  20
            =================================================
        */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
