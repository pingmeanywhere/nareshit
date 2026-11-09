package corejava.part3.collections.lab7;

import java.util.HashMap;
import java.util.Scanner;

public class CourseCatalogIsEmptyUsingHashMap {

    static void main(String[] args) {
         HashMap<Integer, String> map = new HashMap<>();
        System.out.println(map.isEmpty());
        map.put(1, null);
        System.out.println(map.containsValue(null));
    }
}
