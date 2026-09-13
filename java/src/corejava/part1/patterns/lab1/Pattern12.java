package corejava.part1.patterns.lab1;

import java.util.Scanner;

public class Pattern12 {
    static void main(String[] args) {
        /*
            Que 13 : Write Java program to given pattern.
            0
            0  1
            0  1  1
            0  1  1  2
            0  1  1  2  3
            0  1  1  2  3  5
            ===========================================
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            int start = 0;
            int end = 1;
            int next = 0;
            for (int j = 1; j <=i ; j++) {
                if(j == 1) {
                    System.out.print(start + " ");
                }
                else if(j == 2) {
                    System.out.print(end + " ");
                }
                else {
                    next = start + end;
                    start = end;
                    end = next;
                    System.out.print(next + " ");
                }
            }
            System.out.println();
        }
    }
}
