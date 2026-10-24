package corejava.part3.collections.lecture3;

import java.util.Scanner;
import java.util.Vector;

public class RotateAVectorByKPositions {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<Integer> nums = new Vector<>(5);

        System.out.println("Enter K value to rotate : ");
        int k = sc.nextInt();

        System.out.println("Enter the " + nums.capacity() + " elements for nums : ");
        for (int i = 0; i < nums.capacity(); i++) {
            nums.add(sc.nextInt());
        }

        System.out.println("BEFORE ROTATE : " + nums);

        while (k > 0) {
            int temp = nums.getFirst();

            for (int i = 1; i < nums.size(); i++) {
                nums.set(i - 1, nums.get(i));
            }
            nums.set(nums.size() - 1, temp);
            k--;
        }

        System.out.println("ROTATED VECTOR: " + nums);
    }
}
