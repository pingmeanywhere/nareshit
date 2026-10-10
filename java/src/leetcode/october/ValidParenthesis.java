package leetcode.october;

import java.util.Stack;

public class ValidParenthesis {

    static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (st.empty()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    st.push(ch);
                } else {
                    return false;
                }
            } else {

                if (ch == '(' || ch == '{' || ch == '[') {
                    st.push(ch);
                } else if ((ch == ')' && st.peek() == '(')
                        || (ch == '}' && st.peek() == '{')
                        || (ch == ']' && st.peek() == '[')) {
                    st.pop();
                } else {
                    return false;
                }

            }
        }

        return st.isEmpty();

    }

    static void main(String[] args) {

        System.out.println(isValid(")"));

    }
}
