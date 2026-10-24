package corejava.part3.collections.lecture3;

import java.util.Scanner;
import java.util.Vector;

public class IntersectionOfVectors {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> v1 = new Vector<>(5);
        Vector<Integer> v2 = new Vector<>(8);

        System.out.println("Enter the elements for v1 : ");
        for (int i = 0; i < v1.capacity(); i++) {
            v1.add(sc.nextInt());
        }

        System.out.println("Enter the elements for v2 : ");
        for (int i = 0; i < v2.capacity(); i++) {
            v2.add(sc.nextInt());
        }

        Vector<Integer> result = new Vector<>(v1);
        result.retainAll(v2);

        System.out.println("RESULT : " + result);

    }
}
