package leetcode.august;

import java.util.HashMap;

public class MajorityElement {


    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

            if (count.getOrDefault(nums[i], 0) > nums.length / 2) {
                return nums[i];
            }

        }

        return -1;
    }

    static void main(String[] args) {

    }
}
