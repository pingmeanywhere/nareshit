package corejava.part3.arrays.lecture6;

import java.util.Scanner;

public class SumOfSubArrays {


    static int subArraySum(int[] arr) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
            }
            sum = Math.max(sum, currSum);
        }
        return sum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sub array : " + subArraySum(arr));
    }
}
