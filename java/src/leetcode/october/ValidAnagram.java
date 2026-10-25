package leetcode.october;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() != 0) {
                return false;
            }
        }

        return true;
    }

    static void main(String[] args) {
        String s = "anagram";
        String t = "nagarag";

        System.out.println(isAnagram(s, t));
    }
}
