package corejava.part1.dataTypes.lab;

import java.util.Scanner;

public class OnlineCourseFeedback {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String courseName = sc.nextLine();
        int rating = Integer.parseInt(sc.nextLine().trim());
        String feedback = sc.nextLine();

        CourseFeedback courseFeedback = new CourseFeedback(name, courseName, rating, feedback);
        System.out.println(courseFeedback);


    }
}


class CourseFeedback {
    String name;
    String courseName;
    float rating;
    String feedback;


    public CourseFeedback(String name, String courseName, float rating, String feedback) {
        this.name = name;
        this.courseName = courseName;
        this.rating = rating;
        this.feedback = feedback;
    }

    public String toString() {
        return "Thank you, " + name + "!\n" +
                "Course: " + courseName + "\n" +
                "Rating: " + rating + " / 5\n" +
                "Feedback: " + feedback;
    }
}