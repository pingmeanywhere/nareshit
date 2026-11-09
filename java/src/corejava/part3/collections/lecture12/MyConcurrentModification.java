package corejava.part3.collections.lecture12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyConcurrentModification {

    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Iterator<Integer> itr = list.iterator();
        System.out.println(itr.next());
        list.remove(Integer.valueOf(2));


//        while (itr.hasNext()) {
//            list.remove(Integer.valueOf(2));
//            itr.next();
//        }

        System.out.println(list);
    }
}
