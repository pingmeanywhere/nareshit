package corejava.part3.collections.lecture4;

import java.util.Stack;

public class BalancedParenthesis {

    static boolean validParenthesis(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    st.push(ch);
                } else {
                    return false;
                }

            } else {
                if ((st.peek() == '(' && ch == ')')
                        || (st.peek() == '{' && ch == '}')
                        || (st.peek() == '[' && ch == ']')) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }

        return st.isEmpty();
    }

    static void main(String[] args) {
        String s = "[({}{})]";

        System.out.println(validParenthesis(s));
    }
}
