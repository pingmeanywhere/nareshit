package corejava.part2.polymorphism.lab2;

import java.util.Scanner;

public class CourseContentManagementSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = Integer.parseInt(sc.nextLine().trim());
        String title = sc.nextLine();
        CourseContent courseContent = null;

        if (choice == 1) {
            int duration = Integer.parseInt(sc.nextLine().trim());
            if (duration <= 0) {
                System.out.println("Error: Invalid duration for video.");
                return;
            }
            courseContent = new Video(title, duration);
        } else if (choice == 2) {
            String author = sc.nextLine();
            courseContent = new Article(title, author);
        }

        CourseManager courseManager = new CourseManager();
        courseManager.processContent(courseContent);

    }
}


class CourseContent {
    private String title;

    public CourseContent(String title) {
        this.title = title;
    }

    // Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class Video extends CourseContent {
    private int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    // Getter and Setter
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

class Article extends CourseContent {
    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // Getter and Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Quiz extends CourseContent {
    private int numberOfQuestions;

    public Quiz(String title, int numberOfQuestions) {
        super(title);
        this.numberOfQuestions = numberOfQuestions;
    }

    // Getter and Setter
    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
}


class CourseManager {
    public void processContent(CourseContent cc) {
        if (cc instanceof Video video) {
            System.out.println("Processing Video: " + video.getTitle() +
                    " | Duration: " + video.getDuration() + " mins");
        } else if (cc instanceof Article article) {
            System.out.println("Processing Article: " + article.getTitle() +
                    " | Author: " + article.getAuthor());
        }
    }

    public void processMultipleContents(CourseContent[] ccs) {
        for (CourseContent cc : ccs) {
            processContent(cc);
        }
    }
}