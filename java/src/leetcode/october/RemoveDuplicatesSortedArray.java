package leetcode.october;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    static int removeDuplicates(int[] nums) {


        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != nums[left]) {
                int temp = nums[left];
                nums[left + 1] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));
        return left + 1;

    }


    static void main(String[] args) {


        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));

    }
}
