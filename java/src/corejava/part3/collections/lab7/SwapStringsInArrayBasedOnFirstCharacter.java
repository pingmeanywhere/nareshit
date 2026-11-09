package corejava.part3.collections.lab7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SwapStringsInArrayBasedOnFirstCharacter {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().trim());

        String[] nums = new String[size];
        HashMap<Character, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextLine().trim();
        }

        for (int i = 0; i < nums.length; i++) {
            char key = nums[i].charAt(0);
            if (seen.containsKey(key)) {
                String temp = nums[seen.get(key)];
                nums[seen.get(key)] = nums[i];
                nums[i] = temp;
                seen.remove(key);
            } else {
                seen.put(key, i);
            }
        }

        System.out.println("Array after swaps: " + Arrays.toString(nums));
    }
}
