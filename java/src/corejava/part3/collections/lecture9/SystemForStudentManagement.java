package corejava.part3.collections.lecture9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SystemForStudentManagement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            students.add(new Student(Integer.parseInt(sc.nextLine()),
                    sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }

        System.out.println("Before Sort : " + students);
        Collections.sort(students);
        System.out.println("After Sort : " + students);

    }


}

class Student implements Comparable<Student> {
    int rollNumber;
    String name;
    int marks;


    public Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int compareTo(Student o) {
        if (this.marks == o.marks) {
            return this.rollNumber - o.rollNumber;
        }
        return o.marks - this.marks;
    }
}

