package corejava.part1.patterns.lab2;

import java.util.Scanner;

public class Pattern2 {

    static void main(String[] args) {
        /*
            Que 2 : Write JAVA program to given pattern.
                        *
                     *  *
                  *     *
               *        *
            *  *  *  *  *
        */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int space = n - 1;
        int star = 1;

        for (int i = 1; i <=n ; i++) {


            for (int j = 1; j <=space ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=star ; j++) {
                if(j == 1 || j == star || i == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            star++;
            space--;

            System.out.println();
        }


    }

}
