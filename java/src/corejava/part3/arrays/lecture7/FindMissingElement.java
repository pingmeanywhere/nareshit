package corejava.part3.arrays.lecture7;

import java.util.Scanner;

public class FindMissingElement {

    static int findMissingElement(int[] arr) {

        int sum = arr[arr.length - 1] * (arr[arr.length - 1] + 1) / 2;

        int arrSum = 0;
        for (int i : arr) {
            arrSum = arrSum + i;
        }

        if (sum - arrSum == 0) {
            return -1;
        }

        return sum - arrSum;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMissingElement(arr));

    }
}
