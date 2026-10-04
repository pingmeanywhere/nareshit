package corejava.part3.classTypes.lab1;

import java.util.Scanner;

public class MultiLevelDecision {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        University university = new University();
        university.evaluate(marks);

    }
}


class University {
    public void evaluate(int marks) {
        class GradePolicy {
            void calculateGrade() {

                if (marks >= 80) {
                    System.out.println("Grade A");
                } else if (marks >= 60) {
                    System.out.println("Grade B");
                } else if (marks >= 50) {
                    System.out.println("Grade C");
                } else {
                    System.out.println("Fail");
                }

            }
        }

        GradePolicy gradePolicy = new GradePolicy();
        gradePolicy.calculateGrade();
    }
}