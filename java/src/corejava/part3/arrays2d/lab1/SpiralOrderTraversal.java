package corejava.part3.arrays2d.lab1;

import java.util.Scanner;

public class SpiralOrderTraversal {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = 3;
        int col = 3;

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Spiral order print
        System.out.print("Spiral Order: ");
        int top = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[top][i] + " ");
        }
        int right = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i][right] + " ");
        }

        int bottom = arr.length - 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            System.out.print(arr[bottom][i] + " ");
        }

        int middle = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[middle][i] + " ");
        }

    }
}
