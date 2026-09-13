package leetcode.august;

public class RemoveElement {


    public static int removeElement(int[] nums, int val) {

        int left = 0;
        int right = 0;

        while(right < nums.length) {
            if (nums[right] != val) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
            else {
                right++;
            }
        }
        return left;
    }


    static void main(String[] args) {
        System.out.println(removeElement(new int [] {0,1,2,2,3,0,4,2}, 2));
    }
}
