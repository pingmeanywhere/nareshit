package corejava.part3.arrays.lecture3;

import java.util.Scanner;

public class AverageArrayElements {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i : arr) {
            sum  = sum + i;
        }

        System.out.println("AVERAGE : "  + (sum / size));
    }
}
