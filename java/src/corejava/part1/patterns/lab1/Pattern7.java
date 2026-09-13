package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern7 {
    static void main(String[] args) {
        /*
            Que 8:  Write Java program to given pattern.
            A  B  C  D
            B  C  D  E
            C  D  E  F
            D  E  F  G
            ==============================
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((char) (63 + i + j) + " " );
            }
            System.out.println();
        }
    }
}
