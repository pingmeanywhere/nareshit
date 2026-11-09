package corejava.part3.collections.lab7;

import java.util.HashMap;
import java.util.Scanner;

public class SquaringEvenNumbersUsingJavaStreams {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().trim());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            String key = sc.nextLine().trim();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println("Purchase count report:");
        map.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
    }
}
