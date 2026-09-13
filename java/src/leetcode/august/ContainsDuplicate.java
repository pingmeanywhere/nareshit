package leetcode.august;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> count = new HashSet<>();

        for (int i : nums) {
            if (count.contains(i)) {
                return true;
            }

            count.add(i);
        }

        return false;

    }

    static void main(String[] args) {

    }
}
