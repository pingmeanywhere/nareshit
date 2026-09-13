package corejava.part3.arrays.lab2;

import java.util.Scanner;

public class LargestSmallestDifference {

    static int findLargeSmallDiff(int[] arr) {
        int large = arr[0];
        int small = arr[0];

        for (int i : arr) {
            if (i > large) {
                large = i;
            }
            if (i < small) {
                small = i;
            }
        }

        return large - small;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findLargeSmallDiff(arr));

    }
}
