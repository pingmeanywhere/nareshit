package corejava.part3.collections.lab1;

import java.util.Scanner;
import java.util.Stack;

public class BrowserTabManagerClear {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums = Integer.parseInt(sc.nextLine().trim());

        Stack<String> st = new Stack<>();

        for (int i = 0; i < nums; i++) {
            st.push(sc.nextLine().trim());
        }

        System.out.println("Stack before clear: " + st);
        while (!st.isEmpty()) {
            st.pop();
        }
        System.out.println("All tabs closed. ");
        System.out.println("Stack after clear: " + st);

    }
}
