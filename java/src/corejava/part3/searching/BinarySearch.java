package corejava.part3.searching;

import java.util.Scanner;

public class BinarySearch {


    static  boolean binarySearch (int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) {
                return  true;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return  false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println("FOUND : " +  binarySearch(arr, target));

    }
}
