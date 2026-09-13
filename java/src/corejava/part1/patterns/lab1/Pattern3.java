package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern3 {
    static void main(String[] args) {
        /*
            Que 3 : Write Java program to given pattern.
            1   2   3   4   5
            6   7   8   9   10
            11  12  13  14  15
            16  17  18  19  20
            21  22  23  24  25
            ====================================================
        */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((count ++) + " ");
            }
            System.out.println();
        }
    }
}
