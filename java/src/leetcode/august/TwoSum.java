package leetcode.august;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(target - nums[i])) {
                return new int[] { count.get(target - nums[i]), i };
            }

            count.put(nums[i], i);
        }

        return new int[] { -1, -1 };

    }

    static void main(String[] args) {

    }
}
