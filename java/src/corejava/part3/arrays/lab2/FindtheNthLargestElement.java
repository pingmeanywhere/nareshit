package corejava.part3.arrays.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class FindtheNthLargestElement {

    static  int findNthLargest(int [] arr, int nth) {
        int result = arr[0];

        for(int i : arr) {
            int count = 0;
            for (int j : arr) {
                if(i < j) {
                    count++;
                }
            }
            if(count == nth - 1) {
                return i;
            }
        }

        return  -1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int nth = sc.nextInt();

        Arrays.sort(arr);

        System.out.println(findNthLargest(arr, nth));

    }
}
