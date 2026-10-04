package corejava.part3.arrays2d.lab1;

import java.util.Scanner;

public class SumOfJaggedArray {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid Input");
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
        int sum = 0;
        for (int[] ints : arr) {
            for (int i : ints) {
                sum = sum + i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
