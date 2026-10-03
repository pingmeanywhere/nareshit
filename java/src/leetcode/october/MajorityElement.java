package leetcode.october;

import java.util.HashMap;

public class MajorityElement {


    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);

            if (count.getOrDefault(num, 0) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }

    static void main(String[] args) {

    }
}
