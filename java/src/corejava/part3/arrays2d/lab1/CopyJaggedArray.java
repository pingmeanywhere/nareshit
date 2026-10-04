package corejava.part3.arrays2d.lab1;

import java.util.Scanner;

public class CopyJaggedArray {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        int[][] arr = new int[size][];

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                temp[j] = sc.nextInt();
            }
            arr[i] = temp.clone();
        }

        for (int[] ints : arr) {
            for(int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
