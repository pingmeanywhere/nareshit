package corejava.part3.collections.lecture10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class IteratorObjects {

    static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(20, 24, 28, 7));

        Iterator<Integer> vi = v.iterator();

        while (vi.hasNext()) {
           Integer temp = vi.next();

           if(temp == 20) {
               vi.remove();
           }
            System.out.println(temp);
        }

        System.out.println(v);

        /* Disadvantages :
            -> We can iterate only in forward direction but not in backward direction.
            -> We can not skip elements while iterating.
            -> We can only read or remove elements from collections but still can not
               modify the elements in the collection.
        */
    }
}
