package corejava.part3.strings.lecture2;

import java.util.Scanner;

public class IsPalindrome {

    static  boolean isPalindrome (String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        System.out.println(isPalindrome(word));
    }
}
