package corejava.part3.collections.lecture3;

import java.util.Scanner;
import java.util.Vector;

public class MergeTwoVectors {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Integer> v1 = new Vector<>(5);
        Vector<Integer> v2 = new Vector<>(5);

        System.out.println("Enter v1 vector elements : ");

        for (int i = 0; i < v1.capacity(); i++) {
            v1.add(sc.nextInt());
        }

        System.out.println("Enter v2 vector elements : ");
        for (int i = 0; i < v2.capacity(); i++) {
            v2.add(sc.nextInt());
        }
        v2.addAll(v1);
        Vector<Integer> result = new Vector<>();
        for (Integer i : v2) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }

        System.out.println("Final Elements : ");
        System.out.println(result);


    }
}
