package leetcode.october;

import java.util.Stack;

public class LongestValidParenthesis {

    static int longestValidParentheses(String s) {

        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && ((st.peek() == '(' && ch == ')'))) {
                st.pop();
                count += 2;
            } else {
                st.push(ch);
            }
        }
        return count;
    }

    static void main(String[] args) {
        String s = ")()())";

        System.out.println(longestValidParentheses(s));
    }
}
