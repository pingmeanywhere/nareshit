package corejava.part3.collections.lecture4;

import java.util.Stack;

public class ReverseAStringWithStack {

    static String reverse(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        String result = "";
        while (!st.isEmpty()) {
            result += st.peek();
            st.pop();
        }

        return result;
    }

    static void main(String[] args) {

        String str = "hello";

        str = reverse(str);

    }
}
