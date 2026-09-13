package leetcode.august;

import java.util.Arrays;

public class PeakIndexInMountainArray {

    public static  int peakIndexInMountainArray(int[] arr) {

        int res = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if((mid < arr.length && mid > 0 ) && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1] ) {
                return  mid;
            }

            if(arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }


        return  -1;
    }

    static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[] {0,1,2,3,4,5,6,9,10,5,2,1,0}));
    }
}
