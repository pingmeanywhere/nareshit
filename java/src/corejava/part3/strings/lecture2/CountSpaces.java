package corejava.part3.strings.lecture2;

import java.util.Scanner;

public class CountSpaces {

    static int countSpaces(String word) {
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ' ') {
                count++;
            }
        }

        return count + 1;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        System.out.println(countSpaces(word));
        System.out.println(word.split(" ").length);
    }
}
