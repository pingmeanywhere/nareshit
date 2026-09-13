package corejava.part3.arrays.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {

    static int[] moveZeros(int[] arr) {
        int index = 0;
        int[] result = new int[arr.length];
        for (int j : arr) {
            if (j != 0) {
                result[index++] = j;
            }
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

        System.out.println(Arrays.toString(moveZeros(arr)));


    }
}
