package corejava.part1.patterns;

import java.util.Scanner;

public class PascalPattern {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int space = n - 1;
        int box = 1;

        for(int i = 1; i <= n; i++) {

            for (int j = 1;  j <= space; j++) {
                System.out.print("   ");
            }

            int num = i - 1;
            int den = 1;
            int x = 1;

            for (int j = 1; j <= box; j++) {

                System.out.print("  [" + x + "] ");
                x = (x * num) / den;
                num--;
                den++;
            }
            space--;
            box++;

            System.out.println();
        }

    }

}
