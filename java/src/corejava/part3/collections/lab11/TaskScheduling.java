package corejava.part3.collections.lab11;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskScheduling {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().strip());

        Queue<Task> queue = new PriorityQueue<>((a, b) -> a.priority - b.priority);

        for (int i = 0; i < size; i++) {
            String name = sc.nextLine();
            int priority = Integer.parseInt(sc.nextLine().strip());
            if (name.length() > 30) {
                System.out.println("Error - Task name must not exceed 30 characters");
                return;
            }
            queue.add(new Task(name, priority));
        }

        System.out.println("Tasks in ascending priority:");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}

class Task {
    String name;
    int priority;


    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " - " + priority;
    }
}
