package corejava.part3.arrays.lecture2;

import java.util.Scanner;

public class LinearSearch {

    static  int linearSearch (int [] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target");
        int target = sc.nextInt();

        System.out.println("index : " + linearSearch(arr, target));

    }
}
