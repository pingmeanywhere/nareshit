package corejava.part3.arrays.lecture2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("arr : " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("reverse : " + Arrays.toString(arr));
    }
}
