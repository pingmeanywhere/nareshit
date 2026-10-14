package corejava.part2.modifiers.lab;

import java.util.Scanner;

public class SchoolCourseManagementSystem {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String courseName = sc.nextLine();
        String instructorName = sc.nextLine();
        int durationHours = Integer.parseInt(sc.nextLine());

        if (durationHours <= 0) {
            System.out.println("Error: Duration must be greater than 0");
            return;
        }

        Course course = new Course(courseName, instructorName, durationHours);
        course.printCourseDetails();

    }
}

class Course {
    String courseName;
    String instructorName;
    int durationHours;

    public Course(String courseName, String instructorName, int durationHours) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.durationHours = durationHours;
    }

    public void printCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructorName);
        System.out.println("Duration: " + durationHours + " hours");
    }
}