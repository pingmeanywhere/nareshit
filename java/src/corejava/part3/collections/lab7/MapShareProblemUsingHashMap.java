package corejava.part3.collections.lab7;

import java.util.HashMap;
import java.util.Scanner;

public class MapShareProblemUsingHashMap {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().trim());

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(sc.nextLine().trim(), sc.nextLine().trim());
        }

        // check for a exits
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("b", map.get("a"));
        }

        map.remove("c");

        System.out.println("Modified Map: " + map);
    }
}
