package corejava.part3.lambdaExpression.lab1;

import java.util.Scanner;

public class CustomArrayProcessor {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayProcessor a = (int[] nums) -> {
            int sum = 0;
            for (int i : nums) {
                sum += i;
            }
            return sum;
        };

        System.out.println("Sum = " + a.process(arr));

    }
}

interface ArrayProcessor {
    int process(int[] arr);
}