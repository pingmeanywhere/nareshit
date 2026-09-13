package leetcode.august;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int rev = 0;
        int temp = x;

        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }

        if (rev != x) {
            return false;
        }

        return true;

    }

    static void main(String[] args) {
        System.out.println(isPalindrome(53532));
    }
}
