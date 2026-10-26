package corejava.part3.collections.lecture4;

import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("BEFORE : " +  str);
        str = reverse(str);

        System.out.println("REVERSED : " + str);


    }
}
