package corejava.part3.arrays2d.lecture1;

import java.util.Arrays;
import java.util.Scanner;

public class Jagged2DArray {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[][] arr = new int[size][];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("col size");
            int n = sc.nextInt();
            arr[i] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int [] ints: arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
