package corejava.part3.arrays.lecture7;

import java.util.Scanner;

public class FreqecnyOfElement {

    static void frequencyOfElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            boolean isPresent = false;


            for (int j = 0; j < i - 1; j++) {
                if (arr[i] == arr[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " : ->" + count);
            }

        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        frequencyOfElement(arr);
    }
}
