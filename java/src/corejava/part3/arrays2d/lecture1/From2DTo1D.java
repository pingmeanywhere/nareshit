package corejava.part3.arrays2d.lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class From2DTo1D {

    static int[] changeFrom(int[][] arr) {

        int[] result = new int[arr.length * arr[0].length];

        int index = 0;

        for (int[] ints : arr) {
            for (int j : ints) {
                result[index++] = j;
            }
        }

        return result;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.toString(changeFrom(arr)));

    }
}
