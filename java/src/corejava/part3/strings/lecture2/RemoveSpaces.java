package corejava.part3.strings.lecture2;

import java.util.Scanner;

public class RemoveSpaces {

    static String remove(String word) {

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                result = result + word.charAt(i);
            }
        }

        return result;

    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println(remove(word));

    }
}
