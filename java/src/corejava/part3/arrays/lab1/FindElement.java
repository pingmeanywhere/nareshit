package corejava.part3.arrays.lab1;

public class FindElement {

    static boolean searchElement(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }

        return false;
    }

    static void main(String[] args) {
        /*
            4.Write a program to check whether a given element exists in the array
            (linear search).
        */

        int[] arr = {1, 4, 6, 8, 19, 23, 43, 0, 3};
        int target = 5;

        System.out.println(searchElement(arr, target));

    }
}
