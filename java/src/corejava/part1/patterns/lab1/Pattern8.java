package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern8 {
    static void main(String[] args) {
        /*
            Que 9 :  Write Java program to given pattern.
            A  E  I  M
            B  F  J  N
            C  G  K  O
            D  H  L  P
            ===========================
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((char) (60 + i + j + j * 3) + " " );
            }
            System.out.println();
        }
    }
}
