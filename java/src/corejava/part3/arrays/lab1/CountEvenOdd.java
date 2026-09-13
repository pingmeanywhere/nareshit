package corejava.part3.arrays.lab1;

public class CountEvenOdd {

    static void main(String[] args) {
        /*
            1.Write a Java program to count the number of even and odd elements
            in an array.
        */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int even = 0;
        int odd = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("EVEN : " + even + " ODD : " + odd);
    }
}
