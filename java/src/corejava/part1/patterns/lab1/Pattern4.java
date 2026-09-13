package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern4 {
    static void main(String[] args) {
        /*
            Que 5 : Write Java program to given pattern.
            1  2  3  4  5
            2  3  4  5  6
            3  4  5  6  7
            4  5  6  7  8
            5  6  7  8  9
            ==========================================
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            int count = i;
            for (int j = 1; j <=n ; j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
    }
}
