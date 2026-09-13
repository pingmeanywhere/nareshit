package corejava.part3.arrays.lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    static  void selectionSort (int [] arr) {

        for (int i = 0; i < arr.length; i++) {

            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    index = j;
                }
            }

            int temp  = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
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
