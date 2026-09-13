package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern9 {
    static void main(String[] args) {
        /*
            Que 10 :  Write Java program to given pattern
            *  *  *  *  *
            *           *
            *           *
            *           *
            *  *  *  *  *
            ==============================================
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i == 1 || i == n) {
                    System.out.print(" * ");
                } else if(j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
