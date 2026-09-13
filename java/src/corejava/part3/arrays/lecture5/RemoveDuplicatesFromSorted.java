package corejava.part3.arrays.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSorted {

    static  int [] remove(int [] arr) {
        int left = 0;
        int right = 0;

        while(right < arr.length) {
            if(arr[left] != arr[right]) {
                arr[left + 1] =arr[right];
                left++;
            }
            right++;
        }

        int [] result = new int[left + 1];

        int i = 0;
        while(i < left + 1) {
            result[i] = arr[i];
            i++;
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

        System.out.println(Arrays.toString(remove(arr)));
    }
}
