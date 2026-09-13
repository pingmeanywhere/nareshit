package corejava.part1.patterns.lab2;

import java.util.Scanner;

public class Pattern5 {
    static void main(String[] args) {
        /*
            Que 5 : Write JAVA program to given pattern.
             A  B  C  D  E
                A  B  C  D
                   A  B  C
                      A  B
                         A
            ========================================================
        */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int space = 0;
        int star = n;

        char letter = 'A';

        for (int i = 1; i <=n ; i++) {


            for (int j = 1; j <=space ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print((char)(letter + j - 1) + "  ");
            }
            star--;
            space++;

            System.out.println();
            letter++;
        }
    }
}
