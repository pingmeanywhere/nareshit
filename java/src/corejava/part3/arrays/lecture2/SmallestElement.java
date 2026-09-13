package corejava.part3.arrays.lecture2;

import java.util.Scanner;

public class SmallestElement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];

        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println("Smallest : " + smallest);
    }
}
