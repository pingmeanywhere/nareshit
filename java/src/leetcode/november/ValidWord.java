package leetcode.november;

public class ValidWord {

    static boolean isValid(String word) {

        if (word.length() < 3) {
            return false;
        }

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else if (!Character.isDigit(ch)) {
                consonant++;
            }

        }

        if (vowel == 0 || consonant == 0) {
            return false;
        }

        return true;

    }

    static void main(String[] args) {
        System.out.println(Character.toLowerCase('E'));
    }
}
