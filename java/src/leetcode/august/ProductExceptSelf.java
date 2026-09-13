package leetcode.august;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int zero = 0;

        int prod = 1;

        for (int i : nums) {
            if (i != 0) {
                prod = prod * i;
            } else {
                zero++;
            }
        }

        if (zero >= 2) {
            return new int[nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            if (zero == 1) {
                if (nums[i] == 0) {
                    nums[i] = prod;
                } else {
                    nums[i] = 0;
                }
            } else {
                nums[i] = prod / nums[i];
            }
        }

        return nums;

    }

    static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4, 5})));
    }
}
