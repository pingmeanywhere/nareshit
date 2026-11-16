package corejava.part3.collections.lab11;

import java.util.*;

public class CopyData {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().strip());


        Integer[] arr = new Integer[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine().strip());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(arr));
        Queue<Integer> queue = new PriorityQueue<>(numbers);

        System.out.println("PriorityQueue elements (min-heap order): ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
