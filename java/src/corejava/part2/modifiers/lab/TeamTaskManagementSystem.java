package corejava.part2.modifiers.lab;

import java.util.Scanner;

public class TeamTaskManagementSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String taskID = sc.nextLine();
        String assignedTo = sc.nextLine();
        int estimatedHours = Integer.parseInt(sc.nextLine().trim());
        int actualHours = Integer.parseInt(sc.nextLine().trim());
        boolean isCompleted = Boolean.parseBoolean(sc.nextLine().trim());
        int extraHours = Integer.parseInt(sc.nextLine().trim());

        if (extraHours <= 0) {
            System.out.println("Error: Extra hours must be greater than or equal to 0");
            return;
        }

        Task task = new Task(taskID, assignedTo, estimatedHours, actualHours, isCompleted);

        task.addExtraHours(extraHours);
        task.markCompleted();

        task.printTaskDetails();

    }
}


class Task {
    String taskID;
    String assignedTo;
    int estimatedHours;
    int actualHours;
    boolean isCompleted;

    public Task(String taskID, String assignedTo, int estimatedHours,
                int actualHours, boolean isCompleted) {
        this.taskID = taskID;
        this.assignedTo = assignedTo;
        this.estimatedHours = estimatedHours;
        this.actualHours = actualHours;
        this.isCompleted = isCompleted;
    }


    public void markCompleted() {
        this.isCompleted = true;
    }

    public void addExtraHours(int extraHours) {
        this.actualHours = this.actualHours + extraHours;
    }

    public int calculateTotalHours() {
        return actualHours;
    }

    public void printTaskDetails() {
        System.out.println("Task ID: " + taskID);
        System.out.println("Assigned To: " + assignedTo);
        System.out.println("Estimated Hours: " + estimatedHours);
        System.out.println("Actual Hours: " + actualHours);
        System.out.println("Completed: " + (isCompleted ? "Yes" : "No"));
        System.out.println("Role: Team Leader");
    }
}