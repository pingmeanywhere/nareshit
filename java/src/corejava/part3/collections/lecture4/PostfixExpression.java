package corejava.part3.collections.lecture4;

import java.util.Stack;

public class PostfixExpression {

    static int evaluate(String s) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '+') {
                st.push((st.pop() + st.pop()));
            } else if (ch == '-') {
                st.push((st.pop() - st.pop()));
            } else if (ch == '*') {
                st.push((st.pop() * st.pop()));
            } else if (ch == '/') {
                st.push((st.pop() / st.pop()));
            } else if (ch == '%') {
                st.push((st.pop() % st.pop()));
            } else {
                st.push(Integer.parseInt(ch + ""));
            }
        }

        return st.peek();
    }

    static void main(String[] args) {
        String s = "512+4*+3-";

        System.out.println(evaluate(s));
    }

}
