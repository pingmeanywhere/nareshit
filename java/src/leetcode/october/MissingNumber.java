package leetcode.october;

public class MissingNumber {

    static int missingNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ i ^ nums[i];
        }
        result = result ^ (nums.length);

        return result;
    }

    static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1, 0, 3}));
    }
}
