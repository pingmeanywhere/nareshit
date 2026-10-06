package leetcode.october;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 0) {

            }
        }


        return count;
    }

    static void main(String[] args) {

    }

}
