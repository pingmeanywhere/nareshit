package corejava.part3.sortings;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    static  void selectionSort (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;

            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    index = j;
                }
            }

            // Swap the smallest value index with the current value index
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
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
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
