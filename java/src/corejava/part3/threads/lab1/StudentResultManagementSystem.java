package corejava.part3.threads.lab1;

import java.util.Scanner;

public class StudentResultManagementSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter your Id and Name");
            int studentId = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int[] marks = new int[5];
            System.out.println("Enter your marks");
            for (int j = 0; j < marks.length; j++) {
                marks[j] = Integer.parseInt(sc.nextLine());
            }
            students[i] = new Student(studentId, name, marks);
        }

        for (Student student : students) {
            try {
                student.display();
            } catch (InvalidMarksException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}

class Student {
    int studentId;
    String name;
    int[] marks;

    public Student(int studentId, String name, int[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks.clone();
    }

    public int calculateTotalMarks() {
        int sum = 0;
        for (int i : marks) {
            sum += i;
        }
        return sum;
    }

    public double calculateAverageMarks() {
        int total = calculateTotalMarks();
        return total / 5.0;
    }

    public char calculateGrade() {
        double avg = calculateAverageMarks();
        if (avg > 100) return 'X';
        if (avg >= 90) {
            return 'A';
        } else if (avg > 75) {
            return 'B';
        } else if (avg > 60) {
            return 'C';
        }
        return 'F';
    }

    public String getStatus() {
        char grade = calculateGrade();
        if (grade == 'F') {
            return "Fail";
        }
        return "Pass";
    }

    public String toString() {
        return studentId + " | " + name;
    }

    public void display() throws InvalidMarksException {
        System.out.println(this + " | Total: " + calculateTotalMarks() +
                " | Average: " + calculateAverageMarks() +
                " | Grade: " + calculateGrade() +
                " | " + getStatus() + " ");

    }
}

interface ResultProcessor {
    void processResult(Student student) throws InvalidMarksException;
}


class ProcessStudentResult implements ResultProcessor {
    public void processResult(Student student) throws InvalidMarksException {
        if (student.marks.length > 5) {
            throw new InvalidMarksException("Your are entering more than 5 marks for student" +
                    student);
        }
        for (int i : student.marks) {
            if (i > 100 || i < 0) {
                throw new InvalidMarksException("Marks can not be less than 0 OR greater than 100" +
                        student);
            }
        }

    }
}

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}
