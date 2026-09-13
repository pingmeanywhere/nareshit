package corejava.part3.arrays.lecture2;

import java.util.Scanner;

public class NthLargestElement {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int n = 4;

        for(int i : arr) {
            int count = 0;
            for(int j : arr) {
                if(j > i) {
                    count++;
                }
            }
            if(count == n - 1) {
                System.out.println(n + "th : " + i);
                break;
            }
        }


    }
}
