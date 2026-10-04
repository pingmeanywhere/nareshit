package corejava.part3.objectClass.lab1;

import java.util.Scanner;

public class StudentIdentityVerification {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int studentId1 = Integer.parseInt(sc.nextLine());
        String name1 = sc.nextLine();
        String course1 = sc.nextLine();

        int studentId2 = Integer.parseInt(sc.nextLine());
        String name2 = sc.nextLine();
        String course2 = sc.nextLine();

        if (studentId1 < 0 || studentId2 < 0) {
            System.out.println("Error: Student ID must be greater than zero");
            return;
        }

        Student student1 = new Student(studentId1, name1, course1);
        Student student2 = new Student(studentId2, name2, course2);

        if (student1.equals(student2)) {
            System.out.println("Students are equal");
        } else {
            System.out.println("Students are not equal");
        }


    }
}


class Student {
    int studentId;
    String name;
    String course;

    public Student(int studentId, String name, String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    public boolean equals(Object obj) {
        if (obj.getClass() != Student.class) return false;
        Student student = (Student) obj;
        return this.studentId == student.studentId;
    }
}