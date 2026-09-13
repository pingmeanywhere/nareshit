package corejava.part3.arrays.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegativeToLeft {

    static  void moveLeft (int [] arr) {
        int left = 0;
        int right = 0;

        while(right < arr.length) {
            if(arr[right] < 0 ) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        moveLeft(arr);
        System.out.println(Arrays.toString(arr));
    }
}
