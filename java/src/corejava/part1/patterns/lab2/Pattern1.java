package corejava.part1.patterns.lab2;

import java.util.Scanner;

public class Pattern1 {

    static void main(String[] args) {

        /*
            Que 1 : Write JAVA program to given pattern.
            0  1  1  1  0
            1  0  1  0  1
            1  1  0  1  1
            1  0  1  0  1
            0  1  1  1  0
        */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <=n ; i++) {

            int count = 0;

            for (int j = 0; j <=n ; j++) {
                if(i == j ||   i + j == n ) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" 1 ");
                }
            }

            System.out.println();
        }

    }

}
