package leetcode.october;

import java.util.Arrays;
import java.util.Scanner;

public class RotateImage {

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Before Rotation : ");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        rotate(arr);


        System.out.println("After Rotation : ");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
