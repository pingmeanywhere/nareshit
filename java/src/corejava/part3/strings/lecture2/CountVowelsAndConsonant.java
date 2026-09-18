package corejava.part3.strings.lecture2;

import java.util.Scanner;

public class CountVowelsAndConsonant {

    static void count(String word) {
        int vowel = 0;
        int consonant = 0;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ch = Character.toUpperCase(ch);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel++;
            } else {
                if(ch >= 'A' && ch <= 'Z') {
                    consonant++;
                }
            }
        }

        System.out.println("vowel : " + vowel);
        System.out.println("consonant : " + consonant);

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        count(word);
    }
}
