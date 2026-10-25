package leetcode.october;

public class ValidPalindromeSecond {

    static boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }

    static boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        int count = 0;

        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }

        return true;
    }

    static void main(String[] args) {
        String s = "edddede";
        System.out.println(validPalindrome(s));
    }
}
