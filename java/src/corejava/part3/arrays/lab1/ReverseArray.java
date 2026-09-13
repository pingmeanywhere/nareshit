package corejava.part3.arrays.lab1;

import java.util.Arrays;

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

        /*
            3.Write a program to reverse an array without using another array.
        */
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
