package corejava.part3.arrays.lab2;

import java.util.Scanner;

public class CheckArrayIsSorted {

    static boolean checkSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }

        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(checkSorted(arr));
    }
}
