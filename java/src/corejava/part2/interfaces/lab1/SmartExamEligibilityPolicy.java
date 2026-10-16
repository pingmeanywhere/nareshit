package corejava.part2.interfaces.lab1;

import java.util.Scanner;

public class SmartExamEligibilityPolicy {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int attendance = Integer.parseInt(sc.nextLine());

        if (attendance < 0 || attendance > 100) {
            System.out.println("Invalid Input");
            return;
        }

        new ExamApp().checkEligibility(attendance);

    }
}

class ExamApp implements ExamPolicy {

}

interface ExamPolicy {
    private boolean baseValidation(int attendance) {
        if (attendance < 75) {
            return false;
        }

        return true;
    }

    default void checkEligibility(int attendance) {
        if (baseValidation(attendance)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}