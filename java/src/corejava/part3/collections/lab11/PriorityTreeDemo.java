package corejava.part3.collections.lab11;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityTreeDemo {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().strip());
        Queue<String> queue = new PriorityQueue<>();

        for (int i = 0; i < size; i++) {
            String name = sc.nextLine();
            queue.add(name);
        }

        System.out.println("PriorityQueue elements added (min-heap ordering applied).");
        System.out.println("Head of PriorityQueue: " + queue.peek());
        System.out.println();

        System.out.println("Removing elements from PriorityQueue in priority order: ");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("Iterating over remaining elements: ");
        System.out.println("PriorityQueue is empty.");
    }
}
