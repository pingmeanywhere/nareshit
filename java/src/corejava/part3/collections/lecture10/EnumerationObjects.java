package corejava.part3.collections.lecture10;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationObjects {


    static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(20, 24, 28, 7));

        Enumeration<Integer> ve = v.elements();

        while (ve.hasMoreElements()) {
            Integer temp = ve.nextElement();
            /* NOTE : .nextElement() -> it returns the next element and at the same time
            jumps from its first element.*/
            // ve.nextElement() += 10; //-> this line will give error cause can't modify
            if (temp % 2 == 0) {
                System.out.println(temp);
            }
        }


        Hashtable<Character, Integer> table = new Hashtable<>();
        table.put('A', 10);
        table.put('B', 20);
        table.put('C', 30);

        Enumeration<Character> te  = table.keys();
        while (te.hasMoreElements()) {
            System.out.println(te.nextElement());
        }

        /* Disadvantages :
            -> We can iterate only in forward direction but not in backward direction.
            -> We can not skip elements while iterating.
            -> We can only read elements from collections but can not modify the elements in the collection.
            -> Up to Java 1.2 people were using enumeration only for reading the values.
        */
    }
}
