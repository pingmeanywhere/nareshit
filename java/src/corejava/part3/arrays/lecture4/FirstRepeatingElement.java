package corejava.part3.arrays.lecture4;

import java.util.Scanner;

public class FirstRepeatingElement {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            boolean isPresent = false;

            for (int j = 0; j < i - 1; j++) {
                if (arr[i] == arr[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (isPresent) {
                isFound = true;
                System.out.println("IS : " + arr[i]);
                break;
            }
        }

        if (!isFound) {
            System.out.println("NOT FOUND");
        }
    }
}
