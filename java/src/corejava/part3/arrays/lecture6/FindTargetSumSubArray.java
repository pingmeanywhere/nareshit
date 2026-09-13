package corejava.part3.arrays.lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class FindTargetSumSubArray {

    static  int [] findSubArray (int [] arr ,int target) {
        int startIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum == target) {
                    startIndex = i;
                    endIndex = j;
                }
            }

        }

        if(startIndex == -1 || endIndex == -1) {
            return new int[] {-1};
        }

        int length = endIndex - startIndex + 1;
        int [] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = arr[startIndex];
            startIndex++;
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

        int target = sc.nextInt();

        System.out.println(Arrays.toString(findSubArray(arr, target)));

    }
}
