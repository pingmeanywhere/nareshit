package corejava.part3.collections.lab3;

import java.util.Scanner;

public class SumoIntegerArrayWrapper {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        Integer[] newArr = new Integer[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        Integer sum = 0;
        for (Integer i : newArr) {
            sum = sum + i;
        }

        System.out.println("Sum of Integer array: " + sum);

    }
}
