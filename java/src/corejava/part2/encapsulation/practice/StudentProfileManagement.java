package corejava.part2.encapsulation.practice;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class StudentProfileManagement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rollNo = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double marks = Double.parseDouble(sc.nextLine());

        Student student  = new Student();
        student.setRollNo(rollNo);
        student.setName(name);
        student.setAge(age);
        student.setMarks(marks);

        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Marks: " + student.getMarks());

    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private double marks;

    // Getting and Setting rollNo variable
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        if (rollNo > 0) {
            this.rollNo = rollNo;
        }
    }

    // Getting and Setting Name variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getting and Setting age variable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 15 && age <= 60) {
            this.age = age;
        }
    }

    // Getting and Setting age variable
    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }
}
