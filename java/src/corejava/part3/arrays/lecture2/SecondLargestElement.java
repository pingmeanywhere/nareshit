package corejava.part3.arrays.lecture2;

import java.util.Scanner;

public class SecondLargestElement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[1];
        int secondLargest = arr[0];

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + secondLargest);

    }
}
