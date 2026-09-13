package corejava.part3.arrays.lecture7;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
