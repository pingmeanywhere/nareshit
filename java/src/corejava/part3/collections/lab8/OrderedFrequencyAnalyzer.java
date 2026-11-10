package corejava.part3.collections.lab8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderedFrequencyAnalyzer {

    static void processInput(LinkedHashMap<String, Integer> count, String input) {
        count.put(input, count.getOrDefault(input, 0) + 1);

    }

    static void display(LinkedHashMap<String, Integer> count) {
        if (count.isEmpty()) {
            System.out.println("No input data");
            return;
        }
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> count = new LinkedHashMap<>();

        String input = sc.nextLine();
        String[] inputArr = input.split(" ");

        for (String s : inputArr) {
            if (s.equals("-1")) {
                break;
            }
            processInput(count, s);
        }

        display(count);

    }
}
