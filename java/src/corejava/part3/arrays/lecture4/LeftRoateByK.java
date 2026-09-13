package corejava.part3.arrays.lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRoateByK {

    static  void rotate(int [] arr, int k) {

        for(int  i= 0;  i < k; i++) {
            int temp = arr[0];

            for(int j = 0; j < arr.length -1; j++) {

                arr[j] = arr[j + 1];

            }

            arr[arr.length - 1] = temp;
        }

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println("Before : ");
        System.out.println(Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("After : ");
        System.out.println(Arrays.toString(arr));


    }
}
