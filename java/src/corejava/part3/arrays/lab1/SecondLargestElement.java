package corejava.part3.arrays.lab1;

public class SecondLargestElement {

    static void main(String[] args) {
        /*
            2.Write a program to find the second largest element in an array.
        */

        int[] arr = {1, 2, 3, 4, 5, 7, 9, 11};
        int largest = arr[0];
        int secondLargest = -1;

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            }
        }

        System.out.println("Second Largest : " + secondLargest);
    }

}
