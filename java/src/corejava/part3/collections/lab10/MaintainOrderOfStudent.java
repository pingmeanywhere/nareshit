package corejava.part3.collections.lab10;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MaintainOrderOfStudent {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new LinkedHashSet<>();

        int size = Integer.parseInt(sc.nextLine().strip());

        for (int i = 0; i < size; i++) {
            set.add(Integer.parseInt(sc.nextLine().strip()));
        }

        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
