package corejava.part3.arrays.lecture7;

import java.util.Scanner;

public class MajorityElement {
    static boolean isMajorityElementPresent(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > arr.length / 2) {
                return true;

            }
        }

        return false;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isMajorityElementPresent(arr));
    }
}
