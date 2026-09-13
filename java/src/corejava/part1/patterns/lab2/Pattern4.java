package corejava.part1.patterns.lab2;

import java.util.Scanner;

public class Pattern4 {

    static void main(String[] args) {
        /*
            Que 4 :Write JAVA program to given pattern.
             5  4  3  2  1
                4  3  2  1
                   3  2  1
                      2  1
                         1
            ===================================================
        */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int space = 0;
        int star = n;

        int count = n;

        for (int i = 1; i <=n ; i++) {


            for (int j = 1; j <=space ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print(count - j + 1 + "  ");
            }
            star--;
            space++;

            System.out.println();
            count--;
        }

    }
}
