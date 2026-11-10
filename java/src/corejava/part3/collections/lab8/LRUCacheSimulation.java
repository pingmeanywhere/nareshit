package corejava.part3.collections.lab8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LRUCacheSimulation {

    static void processInput(LinkedHashMap<String, Integer> count, String input) {
        count.put(input, count.getOrDefault(input, 0) + 1);
    }

    static void display(LinkedHashMap<String, Integer> count) {
        if (count.isEmpty()) {
            System.out.println("No input data");
            return;
        }
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = Integer.parseInt(sc.nextLine().trim());
        if (capacity == 0) {
            System.out.println("Invalid cache capacity");
            return;
        }
        String[] input = sc.nextLine().trim().split(" ");

        LinkedHashMap<String, Integer> count = new LinkedHashMap<>();

        for (String s : input) {
            if (s.equals("-1")) {
                break;
            }
            count.remove(s);
            if (count.size() == capacity) {
                count.pollFirstEntry();
            }
            processInput(count, s);
        }

        display(count);
    }
}
