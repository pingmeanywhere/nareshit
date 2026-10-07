package corejava.part3.objectClass.lab2;

import java.util.Scanner;

public class InternationalOnlineExamination {

    static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);

        String studentId = sc.nextLine();
        String studentName = sc.nextLine();
        int obtainedMarks = Integer.parseInt(sc.nextLine());
        String attemptId = sc.nextLine();

        String newStudentName = sc.nextLine();
        int newObtainedMarks = Integer.parseInt(sc.nextLine());

        ExamAttempt examAttempt = new ExamAttempt(attemptId,
                new StudentInfo(studentId, studentName), new ExamResult(obtainedMarks));

        System.out.println("Original Exam Attempt");
        System.out.println(examAttempt);

        ExamAttempt cloneAttempt = examAttempt.clone();
        cloneAttempt.studentInfo.studentName = newStudentName;
        cloneAttempt.examResult.obtainedMarks = newObtainedMarks;
        System.out.println("\nCloned Exam Attempt");
        System.out.println(cloneAttempt);

    }
}

class StudentInfo implements Cloneable {
    String studentId;
    String studentName;

    public StudentInfo(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public StudentInfo clone() throws CloneNotSupportedException {
        return (StudentInfo) super.clone();
    }

    public String toString() {
        return "Student ID: " + studentId + '\n' + "Student Name: " + studentName;
    }
}

class ExamResult implements Cloneable {
    int obtainedMarks;

    public ExamResult(int obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public ExamResult clone() throws CloneNotSupportedException {
        return (ExamResult) super.clone();
    }

    public String toString() {
        return "Marks: " + obtainedMarks;
    }
}

class ExamAttempt implements Cloneable {
    String attemptId;
    StudentInfo studentInfo;
    ExamResult examResult;

    public ExamAttempt(String attemptId, StudentInfo studentInfo, ExamResult examResult) {
        this.attemptId = attemptId;
        this.studentInfo = studentInfo;
        this.examResult = examResult;
    }

    public ExamAttempt clone() throws CloneNotSupportedException {
        ExamAttempt copyExamAttempt = (ExamAttempt) super.clone();
        copyExamAttempt.studentInfo = studentInfo.clone();
        copyExamAttempt.examResult = examResult.clone();
        return copyExamAttempt;
    }

    public String toString() {

        return "Attempt ID: " + attemptId + '\n' + studentInfo + '\n' + examResult;
    }
}