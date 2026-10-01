package leetcode.september;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesSortedArray2 {

    static int removeDuplicates(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 1) + 1);

            if (map.get(nums[right]) <= 2 ) {
                int temp = nums[left];
                nums[left + 1] = nums[right];
                nums[right] = temp;
                right++;
            } else {
                left++;
            }
            right++;
        }

        System.out.println(Arrays.toString(nums));
        return left + 1;

    }


    static void main(String[] args) {


        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));

    }
}
