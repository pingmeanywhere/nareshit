package leetcode.august;

public class SortColors {

    public static void sortColors(int[] nums) {
        // Time O(n) , Space O(1)
        int red = 0;
        int white = 0;
        int blue = 0;

        for (int i : nums) {
            if (i == 0) {
                red++;
            } else if (i == 1) {
                white++;

            } else if (i == 2) {
                blue++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (red != 0) {
                nums[i] = 0;
                red--;
            } else if (white != 0) {
                nums[i] = 1;
                white--;
            } else if (blue != 0) {
                nums[i] = 2;
                blue--;
            }
        }

    }

    static void main(String[] args) {
        System.out.println("HELLO");
        sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }
}
