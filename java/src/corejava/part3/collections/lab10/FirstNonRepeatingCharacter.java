package corejava.part3.collections.lab10;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatingCharacter {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().strip();

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        if (set.isEmpty()) {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First non-repeating character: " + set.toArray()[0]);
        }
    }
}
