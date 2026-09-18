package corejava.part3.strings.lecture2;

import java.util.Scanner;

public class ReverseString {

    static  String reverse (String word) {

        String result = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i);
        }

        return  result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        System.out.println(reverse(word));
    }

}
