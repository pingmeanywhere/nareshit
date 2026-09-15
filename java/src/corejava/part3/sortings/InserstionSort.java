package corejava.part3.sortings;

import java.util.Arrays;
import java.util.Scanner;

public class InserstionSort {

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {
                // checking if current element is smaller than previous
                // if yes then swap otherwise break the loop
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
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
