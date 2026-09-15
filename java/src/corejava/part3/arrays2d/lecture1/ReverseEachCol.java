package corejava.part3.arrays2d.lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachCol {

    static  void reverse(int [] arr) {
        int start = 0;
        int end = arr.length - 1;

        while ( start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        for (int[] ints : arr) {
            reverse(ints);
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
