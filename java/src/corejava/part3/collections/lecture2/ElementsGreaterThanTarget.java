package corejava.part3.collections.lecture2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ElementsGreaterThanTarget {

    static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(97);

        for (Integer i : v) {
            if (i >= 35) {
                System.out.println(i + " is greater than 35.");
            }
        }
    }
}
