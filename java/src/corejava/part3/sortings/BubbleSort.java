package corejava.part3.sortings;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int length = arr.length;

        // {4, 1, 3, 2, 5, 0}
        // Run the outer loop for the length off array
        // in the inner loop compare current and next value
        // swap if current value is greater than next
        // since in every iteration last value will be sorted so we can
        // run the loop less than last value

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // now swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
