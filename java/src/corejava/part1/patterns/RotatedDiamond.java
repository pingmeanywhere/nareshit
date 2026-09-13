package corejava.part1.patterns;

import java.util.Scanner;

public class RotatedDiamond {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int space = n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {

            for(int a = 1; a <= star; a++) {
                System.out.print(" * ");
            }

            for(int b = 1; b <= space; b++) {
                System.out.print("   ");
            }

            for(int c = 1; c <= star; c++) {
                System.out.print(" * ");
            }

            if(i <= n/2) {
                space -= 2;
                star++;
            } else {
                space += 2;
                star--;
            }

            System.out.println();
        }
    }
}
