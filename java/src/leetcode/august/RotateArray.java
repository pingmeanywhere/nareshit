package leetcode.august;

import java.util.Arrays;

public class RotateArray {

    static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }


    static void rotate(int[] nums, int k) {

        if (k >= nums.length) {
            k = k % nums.length;
        }

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};

        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

    }
}
