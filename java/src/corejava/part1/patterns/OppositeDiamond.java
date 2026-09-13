package corejava.part1.patterns;

import java.util.Scanner;

public class OppositeDiamond {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("Enter an odd number only");
            return;
        }

        int space = 0;
        int star = n;

        for(int i = 1; i <= n; i++) {
            for(int b = 1; b <= space; b++) {
                System.out.print("   ");
            }
            for(int a = 1; a <= star; a++) {
                System.out.print(" * ");
            }

            if(i <= n/2) {
                space++;
                star -=2;
            } else {
                space--;
                star += 2;
            }

            System.out.println();
        }
    }
}
