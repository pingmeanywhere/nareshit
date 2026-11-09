package corejava.part3.collections.lab6;

import java.util.LinkedList;
import java.util.Scanner;

public class SmartTaskManager {

    static void addTaskAtBeginning(LinkedList<String> tasks, String task) {
        tasks.addFirst(task);
    }

    static void addTaskAtEnd(LinkedList<String> tasks, String task) {
        tasks.addLast(task);
    }

    static String viewNextTask(LinkedList<String> tasks) {
        return tasks.peekFirst();
    }

    static void processNextTask(LinkedList<String> tasks) {
        System.out.println("Processed task: " + tasks.pollFirst());
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().trim());

        LinkedList<String> tasks = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            tasks.add(sc.nextLine());
        }

        try {
            String firstTask = sc.nextLine();
            addTaskAtBeginning(tasks, firstTask);
            String lastTask = sc.nextLine();
            addTaskAtEnd(tasks, lastTask);
        } catch (Exception _) {

        }

        System.out.println("Tasks after adding: " + tasks);
        System.out.println("Next task: " + viewNextTask(tasks));
        processNextTask(tasks);
        System.out.println("Final tasks: " + tasks);
    }
}
