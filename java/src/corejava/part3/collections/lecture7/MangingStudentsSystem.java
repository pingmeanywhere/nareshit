package corejava.part3.collections.lecture7;

import java.util.Hashtable;
import java.util.Scanner;

public class MangingStudentsSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManagement studentManagement = new StudentManagement();

        System.out.println("Enter number of students : ");
        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.println("Enter student details : ");
            studentManagement.addStudent(new Student(Integer.parseInt(sc.nextLine()),
                    sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }

        System.out.println(studentManagement);

        System.out.println("Enter id to print : ");
        int id = Integer.parseInt(sc.nextLine());
        studentManagement.displayStudent(id);


        System.out.println("Enter id to remove : ");
        id = Integer.parseInt(sc.nextLine());
        studentManagement.removeStudent(id);

        System.out.println("Enter id to print : ");
        id = Integer.parseInt(sc.nextLine());
        studentManagement.displayStudent(id);

        System.out.println("All student : ");
        System.out.println(studentManagement);


    }
}

class Student {
    int studentId;
    String name;
    double marks;


    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }
}

class StudentManagement {
    Hashtable<Integer, Student> students;

    public StudentManagement() {
        this.students = new Hashtable<>();
    }

    public void addStudent(Student student) {
        students.put(student.studentId, student);
        System.out.println(student.studentId + " is added successfully in the database.");
    }

    public void removeStudent(int id) {
        students.remove(id);
        System.out.println(id + " is removed successfully from the database.");
    }


    public void displayStudent(int id) {
        if (students.containsKey(id)) {
            System.out.println(students.get(id));
        } else {
            System.out.println("STUDENT NOT FOUND WITH ID " + id);
        }
    }

    @Override
    public String toString() {
        return "StudentManagement{" +
                "students=" + students +
                '}';
    }
}
