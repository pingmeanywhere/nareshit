package corejava.part3.collections.lecture6;

import java.util.Hashtable;
import java.util.Scanner;

public class OccurrenceOfCharacters {

    static Hashtable<Character, Integer> findOccurrence(String s) {
        Hashtable<Character, Integer> table = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (table.containsKey(ch)) {
                table.put(ch, table.get(ch) + 1);
            } else {
                table.put(ch, 1);
            }
        }
        return table;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(findOccurrence(s));
    }
}
