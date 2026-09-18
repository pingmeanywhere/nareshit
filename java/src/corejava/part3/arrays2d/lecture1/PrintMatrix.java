package corejava.part3.arrays2d.lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMatrix {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows :");
        int row = sc.nextInt();
        System.out.println("Enter the columns :");
        int col = sc.nextInt();

        int [][] arr = new int[row][col];

        System.out.println("Enter the matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given Matrix : ");
        for (int[] ints : arr) {
            System.out.println( Arrays.toString(ints));
        }
    }
}
