package corejava.part3.arrays.lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            length--;
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
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
