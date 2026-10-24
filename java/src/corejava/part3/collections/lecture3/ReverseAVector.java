package corejava.part3.collections.lecture3;

import java.util.Scanner;
import java.util.Vector;

public class ReverseAVector {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> nums = new Vector<>(5);

        System.out.println("Enter the " + nums.capacity() + " elements for nums : ");
        for (int i = 0; i < nums.capacity(); i++) {
            nums.add(sc.nextInt());
        }

        System.out.println("BEFORE REVERSE : " + nums);

        int start = 0;
        int end = nums.size() - 1;

        while (start <= end) {
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
        }

        System.out.println("ELEMENT REVERSED : " + nums);


    }
}
