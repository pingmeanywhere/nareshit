package corejava.part3.collections.lab11;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharacter {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().strip();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == ' ') {
                ch = '_';
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}
