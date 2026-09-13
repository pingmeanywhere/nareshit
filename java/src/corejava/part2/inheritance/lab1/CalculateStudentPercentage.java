package corejava.part2.inheritance.lab1;

import java.util.Scanner;

public class CalculateStudentPercentage {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        int rollNumber = Integer.parseInt(sc.nextLine());
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();

        if (marks1 < 0 || marks2 < 0 || marks3 < 0) {
            System.out.println("Error Invalid Input");
            return;
        }

        Student student;
        if (choice == 1) {
            student = new SceinceStudent(name, rollNumber, marks1, marks2, marks3);
        } else {
            student = new ArtsStudent(name, rollNumber, marks1, marks2, marks3);
        }

        student.displayDetails();


    }
}

class Student {
    protected String name;
    protected int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void displayDetails() {
        System.out.println("Science Student Details: ");
        System.out.println("Name: " + this.getName());
        System.out.println("Roll Number: " + this.getRollNumber());
    }

    public double calculatePercentage() {
        return 0;
    }
}

class SceinceStudent extends Student {
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMarks;

    public SceinceStudent(String name, int rollNumber,
                          int physicsMarks, int chemistryMarks, int mathMarks) {
        super(name, rollNumber);
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathMarks = mathMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public double calculatePercentage() {
        return (getPhysicsMarks() + getChemistryMarks() + getMathMarks()) / 3.0;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Physics Marks: " + getPhysicsMarks());
        System.out.println("Chemistry Marks: " + getChemistryMarks());
        System.out.println("Math Marks: " + getMathMarks());
        System.out.println("Percentage: " + this.calculatePercentage() + "%");
    }


}


class ArtsStudent extends Student {
    private int historyMarks;
    private int geographyMarks;
    private int englishMarks;

    public ArtsStudent(String name, int rollNumber, int historyMarks,
                       int geographyMarks, int englishMarks) {
        super(name, rollNumber);
        this.historyMarks = historyMarks;
        this.geographyMarks = geographyMarks;
        this.englishMarks = englishMarks;
    }

    public int getHistoryMarks() {
        return historyMarks;
    }

    public int getGeographyMarks() {
        return geographyMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public double calculatePercentage() {
        return (getHistoryMarks() + getGeographyMarks() + getEnglishMarks()) / 3.0;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("History Marks: " + this.getHistoryMarks());
        System.out.println("Geography Marks: " + this.getGeographyMarks());
        System.out.println("English Marks: " + this.getEnglishMarks());
        System.out.println("Percentage: " + this.calculatePercentage() + "%");
    }
}


