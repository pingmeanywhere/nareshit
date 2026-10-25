package corejava.part3.collections.lecture3;

import java.util.Scanner;
import java.util.Vector;

public class RemoveDuplicatesFromVector {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> nums = new Vector<>(5);

        System.out.println("Enter the " + nums.capacity() + " elements for nums : ");
        for (int i = 0; i < nums.capacity(); i++) {
            nums.add(sc.nextInt());
        }

        System.out.println("BEFORE : " + nums);

        Vector<Integer> res = new Vector<>();

        for (Integer i : nums) {
            if(!res.contains(i)){
                res.add(i);
            }
        }

        System.out.println("RESULT : " + res);
    }
}
