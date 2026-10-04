package corejava.part3.arrays2d.lab1;

import java.util.Scanner;

public class ReplaceNegativesWithZero {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[][] arr = new int[size][];

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    arr[i][j] = 0;
                }
            }
        }


        // Printing the 2D arrray
        for (int[] ints : arr) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
