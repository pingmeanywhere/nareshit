package corejava.part3.arrays.lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {



    static int[] merge(int[] arr1, int[] arr2) {

        return arr1;
    }


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();


        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

//        System.out.println(Arrays.toString(merge(arr1, arr2)));

    }
}
