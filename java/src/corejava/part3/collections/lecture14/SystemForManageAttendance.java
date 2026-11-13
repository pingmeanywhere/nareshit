package corejava.part3.collections.lecture14;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SystemForManageAttendance {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AttendanceManagement at = new AttendanceManagement();

        while (true) {

            System.out.println("Enter you choice 1: register, 2: display ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter id, name and present/absent");
                    int id = Integer.parseInt(sc.nextLine());
                    at.markAttendance(new Student(id, sc.nextLine(), sc.nextLine()));
                }
                case 2 -> {
                    System.out.println("Display student ");
                    at.displayAttendance();
                }
                case 3 -> {
                    System.out.println("Search Student with id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println(at.searchStudent(id));
                }
                case 4 -> {
                    System.out.println("All present students ");
                    System.out.println(at.countPresentStudents());
                }
                case 5 -> {
                    System.out.println("Ente id and status to update attendance'");
                    int id = Integer.parseInt(sc.nextLine());
                    at.updateAttendance(id, sc.nextLine());
                }
                default -> {
                    System.exit(0);
                }
            }
        }
    }
}

class Person {
    private int id;
    private String name;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

class Student extends Person {
    private String attendanceStatus;

    public Student(int id, String name, String attendanceStatus) {
        super(id, name);
        this.attendanceStatus = attendanceStatus;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "attendanceStatus='" + attendanceStatus + '\'' + '}';
    }
}

class AttendanceManagement {
    LinkedHashMap<Integer, Student> students;

    public AttendanceManagement() {
        students = new LinkedHashMap<>();
    }

    public void markAttendance(Student student) {
        students.put(student.getId(), student);
    }

    public void updateAttendance(int id, String status) {
        if (students.containsKey(id)) {
            students.get(id).setAttendanceStatus(status);
        } else {
            System.out.println("Student not found with this id " + id);
        }
    }

    public Student searchStudent(int id) {
        if (!students.containsKey(id)) {
            return null;
        }

        return students.get(id);
    }

    public void displayAttendance() {
        for (Student s : students.values()) {
            System.out.println(s.getName() + " : " + s.getAttendanceStatus());
        }
    }

    public int countPresentStudents() {
        int count = 0;
        for (Student s : students.values()) {
            if (s.getAttendanceStatus().equalsIgnoreCase("present")) {
                count++;
            }
        }
        return count;
    }
}
