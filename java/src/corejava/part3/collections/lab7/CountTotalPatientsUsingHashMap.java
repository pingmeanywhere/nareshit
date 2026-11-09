package corejava.part3.collections.lab7;

import java.util.HashMap;
import java.util.Scanner;

public class CountTotalPatientsUsingHashMap {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().trim());

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            map.put(Integer.parseInt(sc.nextLine()), sc.nextLine());
        }

        System.out.println("Total number of patients: " + map.size());
    }
}
