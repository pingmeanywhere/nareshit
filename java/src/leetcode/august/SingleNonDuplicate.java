package leetcode.august;

public class SingleNonDuplicate {

    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        if (end == 0 || nums[0] != nums[1]) {
            return nums[0];
        }

        if (nums[end] != nums[end - 1]) {
            return nums[end];
        }

        while (start <= end) {
            int mid = (start + end) / 2;

            if ((mid < nums.length && mid >= 0) &&
                    nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if ((mid < nums.length && mid >= 0) && (mid % 2 == 0 && (nums[mid] == nums[mid + 1])
                    || mid % 2 != 0 && (nums[mid] == nums[mid - 1]))) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;

    }

    static void main(String[] args) {
        System.out.println(new SingleNonDuplicate().singleNonDuplicate(
                new int[]{1, 1, 2, 2, 3, 3, 4, 4, 8, 8, 9, 9, 10, 11, 11, 12, 12}));
    }
}
