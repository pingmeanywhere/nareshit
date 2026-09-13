package corejava.part3.arrays.lab2;

import java.util.Scanner;

public class CountElementInArray {

    static int countElements(int[] arr, int target) {
        int count = 0;

        for (int i : arr) {
            if (i == target) {
                count++;
            }
        }

        return count;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(countElements(arr, target));

    }
}
