package leetcode.november;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    static int longestConsecutive(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int longest = 0;
        int curr = 0;
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] == sorted[i - 1]) {
                continue;
            }
            if (sorted[i] == sorted[i - 1] + 1) {
                curr++;
            } else {
                longest = Math.max(longest, curr);
                curr = 0;
            }
        }
        longest = Math.max(longest, curr);

        return longest + 1;

    }

    static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
