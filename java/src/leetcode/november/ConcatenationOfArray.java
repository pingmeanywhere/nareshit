package leetcode.november;

import java.util.Arrays;

public class ConcatenationOfArray {

    static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    static void main(String[] args) {
        int[] result = getConcatenation(new int[]{1, 2, 3, 4});

        System.out.println(Arrays.toString(result));
    }
}
