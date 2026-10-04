package corejava.part3.classTypes.lab1;

import java.util.Scanner;

public class ExamResultEvaluationSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentName = sc.nextLine();
        int theoryMarks = Integer.parseInt(sc.nextLine());
        int practicalMarks = Integer.parseInt(sc.nextLine());

        if (theoryMarks < 0 || theoryMarks > 50) {
            System.out.println("Error: Theory marks must be between 0 and 50");
            return;
        }

        ExamSystem examSystem = new ExamSystem(studentName, theoryMarks, practicalMarks);

        examSystem.evaluateResult();


    }
}

class ExamSystem {
    String studentName;
    int theoryMarks;
    int practicalMarks;

    public ExamSystem(String studentName, int theoryMarks, int practicalMarks) {
        this.studentName = studentName;
        this.theoryMarks = theoryMarks;
        this.practicalMarks = practicalMarks;
    }

    public void evaluateResult() {
        class ResultEvaluator {
            public void printResult() {
                int totalMarks = theoryMarks + practicalMarks;
                System.out.println("Student: " + studentName);
                System.out.println("Total marks: " + totalMarks);
                if (totalMarks >= 50) {
                    System.out.println("Result: Pass");
                } else {
                    System.out.println("Result: Fail");
                }
            }
        }

        ResultEvaluator resultEvaluator = new ResultEvaluator();
        resultEvaluator.printResult();
    }
}