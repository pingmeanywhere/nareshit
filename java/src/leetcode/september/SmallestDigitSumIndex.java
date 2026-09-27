package leetcode.september;

public class SmallestDigitSumIndex {

    static int findSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }

    static int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (findSum(nums[i]) == i) {
                return i;
            }
        }

        return -1;
    }

    static void main(String[] args) {

        System.out.println(smallestIndex(new int [] {1, 5, 6, 30}));

    }
}
