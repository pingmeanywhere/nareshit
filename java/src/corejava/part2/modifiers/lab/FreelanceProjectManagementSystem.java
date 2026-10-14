package corejava.part2.modifiers.lab;

import java.util.Scanner;

public class FreelanceProjectManagementSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String projectID = sc.nextLine();
        String freelancerName = sc.nextLine();
        int hoursWorked = Integer.parseInt(sc.nextLine());
        int hourlyRate = Integer.parseInt(sc.nextLine());

        if (hoursWorked <= 0) {
            System.out.println("Error: Hours worked must be greater than 0");
            return;
        }

        Project project = new Project(projectID, freelancerName, hoursWorked, hourlyRate);
        project.printProjectDetails();

    }
}

class Project {
    String projectID;
    String freelancerName;
    int hoursWorked;
    double hourlyRate;

    public Project(String projectID, String freelancerName, int hoursWorked, double hourlyRate) {
        this.projectID = projectID;
        this.freelancerName = freelancerName;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateTotalCost() {
        return hoursWorked * hourlyRate;
    }

    public void printProjectDetails() {
        System.out.println("Project ID: " + projectID);
        System.out.println("Freelancer: " + freelancerName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}
