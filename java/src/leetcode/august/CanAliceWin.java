package leetcode.august;

public class CanAliceWin {

    static boolean winOrLoose(int[] nums) {

        int sumSingle = 0;
        int sumMultiple = 0;

        for (int i : nums) {
            if (i < 10) {
                sumSingle = sumSingle + i;
            } else {
                sumMultiple = sumMultiple + i;
            }
        }

        if (sumSingle > sumMultiple || sumMultiple > sumSingle) {
            return true;
        }

        return false;
    }

    public boolean canAliceWin(int[] nums) {
        return winOrLoose(nums);
    }

    static void main(String[] args) {

    }
}
