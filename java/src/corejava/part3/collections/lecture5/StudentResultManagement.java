package corejava.part3.collections.lecture5;

import java.util.Scanner;
import java.util.Vector;

public class StudentResultManagement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        Vector<Student> st = new Vector<>();

        for (int i = 0; i < size; i++) {
            int rollNumber = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            double marks = Double.parseDouble(sc.nextLine());
            Student student = new Student(rollNumber, name, marks);
            st.add(student);
        }

        for (Student s : st) {
            s.displayDetails();
            System.out.println();
        }

    }
}

class Student {
    int rollNumber;
    String name;
    double marks;


    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("RollNo : " + rollNumber);
        System.out.println("Name   : " + name);
        System.out.println("Marks  : " + marks);
    }
}
