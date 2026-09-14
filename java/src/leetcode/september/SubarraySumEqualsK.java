package leetcode.september;

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {

                sum = sum + nums[j];
                if (sum == k) {
                    count++;
                    break;
                }

            }
        }

        return count;

    }

    static void main(String[] args) {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();

        int result = subarraySumEqualsK.subarraySum(new int[]{1, 2, 3, 3, 3, 4}, 6);
        System.out.println(result);
    }
}
