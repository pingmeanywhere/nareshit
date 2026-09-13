package corejava.part3.arrays.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    static  boolean isPresent (int [] arr, int index) {
        for(int i = 0; i < index; i++) {
            if(arr[i] == arr[index]) {
                return true;
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

        int length = 0;

        for(int i =  0; i < arr.length; i++) {
            if(!isPresent(arr, i)) {
                length++;
            }
        }

        int [] ans = new int[length];

        int ansIndex = 0;
        for(int i = 0; i < arr.length; i++) {
           if(!isPresent(arr, i))  {
               ans[ansIndex] = arr[i];
               ansIndex++;
           }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));

    }
}
