package leetcode.august;

public class FindFirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {

        int[] result = { -1, -1 };

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    result[0] = mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    result[1] = mid;
                }
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    static void main(String[] args) {

    }
}
