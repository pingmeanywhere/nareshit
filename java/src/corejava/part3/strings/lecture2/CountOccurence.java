package corejava.part3.strings.lecture2;

import java.util.Scanner;

public class CountOccurence {

    static  int countOccurences(String word, char target) {
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == target) {
                count++;
            }
        }

        return  count;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char target = sc.nextLine().charAt(0);

        System.out.println(countOccurences(word, target));
    }
}
