package corejava.part3.arrays.lecture7;

import java.util.Scanner;

public class PairSum {

    static  void findPairSum (int [] arr, int target) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("[ " + arr[i] + ", " + arr[j] + " ]");
                }
            }
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        findPairSum(arr, target);
    }
}
