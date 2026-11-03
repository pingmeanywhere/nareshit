package corejava.part3.collections.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ResultManagementSystem {

    static int binarySearch(ArrayList<Student> students, int target) {
        int start = 0;
        int end = students.size() - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (students.get(mid).id == target) {
                return mid;
            } else if (students.get(mid).id < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter number of students : ");
        int size = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < size; i++) {
            System.out.println("Enter student id, name and marks : ");
            students.add(new Student(Integer.parseInt(sc.nextLine().trim()), sc.nextLine().trim(),
                    Double.parseDouble(sc.nextLine().trim())));
        }

        System.out.println("Original Students : ");
        for (Student i : students) {
            i.displayDetails();
        }

        Collections.sort(students);

        System.out.println("Sorted by marks Students : ");
        for (Student i : students) {
            i.displayDetails();
        }

        Collections.sort(students, new StudentNameComparator());

        System.out.println("Sorted by names Students : ");
        for (Student i : students) {
            i.displayDetails();
        }

        Collections.sort(students);
        System.out.println("Enter searchId : ");
        int searchId = Integer.parseInt(sc.nextLine().trim());

        int index = binarySearch(students, searchId);

        if (index == -1) {
            System.out.println("Student not found");

        } else {
            Student student = students.get(index);
            student.displayDetails();
        }


    }
}


class Student implements Comparable<Student> {
    int id;
    String name;
    double marks;


    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.marks = 0.0;
    }


    // Get students result
    public String getResult() {
        return this.marks >= 40 ? "PASS" : "FAIL";
    }

    // Display student details
    public void displayDetails() {
        System.out.println("ID    : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Marks : " + this.name);
    }

    public int compareTo(Student o) {
        if (this.marks == o.marks) {
            return this.id - o.id;
        }
        return (int) (this.marks - o.marks);
    }


}


class StudentNameComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name)) {
            return o1.id - o2.id;
        }
        return o1.name.compareTo(o2.name);
    }
}