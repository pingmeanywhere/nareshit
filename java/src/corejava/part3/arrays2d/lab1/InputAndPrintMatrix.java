package corejava.part3.arrays2d.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndPrintMatrix {


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
        System.out.println("Matrix:");
        for (int[] ints : arr) {
            for(int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
