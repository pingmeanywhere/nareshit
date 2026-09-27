package leetcode.september;

import java.util.Arrays;

public class MergeSortedArray {

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        /*
            nums1 : [1, 2, 3, 0, 0, 0]
            nums2 : [2, 5, 6]
         */

        while (i >= 0 && j >= 0) {
            if(nums2[j] > nums1[i]) {
                nums1[k] = nums2[j--];
            } else {
                nums1[i + 1] = nums1[i];
                nums1[i--] = nums2[j--];
            }
            k--;
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }

    static void main(String[] args) {

        int [] nums1 = {0};
        int [] nums2 = {2};

        merge(nums1, 0, nums2, 1);

        System.out.println(Arrays.toString(nums1));


    }
}
