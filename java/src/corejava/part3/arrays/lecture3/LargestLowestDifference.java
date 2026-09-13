package corejava.part3.arrays.lecture3;

import java.util.Scanner;

public class LargestLowestDifference {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int lowest = arr[0];

        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
            if (i < lowest) {
                lowest = i;
            }
        }


        System.out.println("DIFF : " + (largest - lowest));
    }
}
