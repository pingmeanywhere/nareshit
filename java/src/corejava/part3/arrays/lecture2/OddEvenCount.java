package corejava.part3.arrays.lecture2;

import java.util.Scanner;

public class OddEvenCount {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for(int i : arr) {
            if(i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("EVEN : " + even);
        System.out.println("ODD : " + odd);
    }
}
