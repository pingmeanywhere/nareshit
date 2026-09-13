package corejava.part3.arrays.lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfArrays {

    static boolean isPresent(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }


    static int[] intersectionOfArrays(int[] arr1, int[] arr2) {
        int length = 0;

        for (int i = 0; i < arr1.length; i++) {
            if(isPresent(arr2, arr1[i])) {
                length++;
            }
        }

        int [] result = new int [length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            if(isPresent(arr2, arr1[i])) {
                result[index++] = arr1[i];
            }
        }

        return  result;

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

        System.out.println(Arrays.toString(intersectionOfArrays(arr1, arr2)));

    }
}
