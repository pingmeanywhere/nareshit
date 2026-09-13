package corejava.part3.arrays.lecture7;

import java.util.Scanner;

public class MinPairDifference {

    static void findMinDifference(int[] arr) {

        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                diff = Math.min(diff, Math.abs(arr[i] - arr[j]));
            }
        }

        System.out.println("DIFF : " + diff);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        findMinDifference(arr);
    }
}
