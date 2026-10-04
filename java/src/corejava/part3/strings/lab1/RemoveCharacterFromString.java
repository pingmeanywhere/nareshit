package corejava.part3.strings.lab1;

import java.util.Scanner;

public class RemoveCharacterFromString {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char ch = sc.nextLine().charAt(0);

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                res = res + s.charAt(i);
            }
        }

        System.out.println(res);
    }
}
