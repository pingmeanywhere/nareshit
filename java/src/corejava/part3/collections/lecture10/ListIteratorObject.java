package corejava.part3.collections.lecture10;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorObject {

    static void main(String[] args) {

        Vector<Integer> v = new Vector<>(Arrays.asList(20, 24, 28, 17));


        ListIterator<Integer> vlt = v.listIterator();

        while (vlt.hasNext()) {
            System.out.println( vlt.next());
        }

        while (vlt.hasPrevious()) {
            System.out.println(vlt.previous());
        }

        /*
            -> Introduced in 1.0
            -> It is only applicable for list collections
            -> It is bidirectional
            -> We can read, remove, add & set elements
        */
    }
}
