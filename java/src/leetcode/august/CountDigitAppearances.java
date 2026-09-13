package leetcode.august;

public class CountDigitAppearances {

    public static int countDigitOccurrences(int[] nums, int digit) {

        int count = 0;

        for (int i : nums) {
            while (i != 0) {
                if (i % 10 == digit) {
                    count++;
                }
                i = i / 10;
            }
        }

        return count;

    }

    static void main(String[] args) {
        System.out.println(countDigitOccurrences(new int [] {123, 32, 35, 32}, 3));
    }
}
