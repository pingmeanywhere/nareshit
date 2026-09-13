package corejava.part1.patterns;

import java.util.Scanner;

public class TrianglePattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int space = n - 1;
        int starSpace = 1;

        for(int i = 1; i <= n; i++) {
            for(int a = 1; a <= space; a++) {
                System.out.print(" ");
            }

            for(int b = 1; b <= starSpace; b++) {
                System.out.print("* ");
            }

            space--;
            starSpace++;
            System.out.println();
        }
    }
}
