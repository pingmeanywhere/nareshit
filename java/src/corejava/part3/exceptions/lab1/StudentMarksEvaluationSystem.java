package corejava.part3.exceptions.lab1;

import java.util.Scanner;

public class StudentMarksEvaluationSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int subjects = sc.nextInt();

        int[] marks = new int[subjects];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        MarksEvaluator marksEvaluator = null;
        if (choice == 1) {
            marksEvaluator = new TheoryMarksEvaluator();
        }
        if (choice == 2) {
            marksEvaluator = new PracticalMarksEvaluator();
        }

        try {
            marksEvaluator.evaluate(marks);
            System.out.println("Evaluation completed");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

    }
}

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

interface MarksEvaluator {
    double evaluate(int[] marks) throws InvalidMarksException;
}

class TheoryMarksEvaluator implements MarksEvaluator {
    public double evaluate(int[] marks) throws InvalidMarksException {
        for (int i : marks) {
            if (i < 0) {
                throw new InvalidMarksException("Error: Invalid marks found");
            }
        }
        return 0;
    }
}

class PracticalMarksEvaluator implements MarksEvaluator {
    public double evaluate(int[] marks) throws InvalidMarksException {
        for (int i : marks) {
            if (i < 0) {
                throw new InvalidMarksException("Error: Invalid marks found");
            }
        }
        return 0;
    }
}