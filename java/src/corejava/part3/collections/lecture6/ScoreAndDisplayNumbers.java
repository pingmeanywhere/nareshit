package corejava.part3.collections.lecture6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class ScoreAndDisplayNumbers {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        int size = sc.nextInt();

        for(int i = 0; i < size; i++) {
            ht.put(sc.nextInt(), sc.nextInt());
        }

        ht.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        for(Map.Entry<Integer, Integer> entry : ht.entrySet()) {
            System.out.println(entry);
        }

        for(Integer i : ht.keySet()) {
            System.out.println("KEY : " + i);
        }

        for(Integer i : ht.values()) {
            System.out.println("VALUES : " + i);
        }
    }
}
