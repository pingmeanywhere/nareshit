package leetcode.october;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    static int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String i : tokens) {
            switch (i) {
                case "+" -> st.push(st.pop() + st.pop());
                case "-" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b - a);
                }
                case "*" -> st.push(st.pop() * st.pop());
                case "/" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b / a);
                }
                default -> st.push(Integer.parseInt(i));
            }
        }

        return st.peek();
    }

    static void main(String[] args) {
        String[] s = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        System.out.println(evalRPN(s));
    }
}
