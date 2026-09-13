package corejava.part3.arrays.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        int i = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            result[i++] = arr[j];
        }

        return result;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(reverse(arr)));

    }
}
