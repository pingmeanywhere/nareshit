package leetcode.september;

public class FirstOccurrenceString {

    static int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        }

        return -1;

    }

    static void main(String[] args) {


        String haystack = "leetcodeleeto";
        String needle = "leeto";

        System.out.println(strStr(haystack, needle));

    }
}
