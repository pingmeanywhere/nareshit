package corejava.part3.arrays.lecture4;

import java.util.Scanner;

public class NonRepeatingElement {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isNonRepeating = false;

        for (int i = 0; i < arr.length; i++) {
            boolean isPresent = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                isNonRepeating = true;
                System.out.println("Non repeating : " + arr[i]);
                break;
            }
        }

        if (!isNonRepeating) {
            System.out.println("No non repeating elements");
        }
    }
}
