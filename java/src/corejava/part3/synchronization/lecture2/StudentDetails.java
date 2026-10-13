package corejava.part3.synchronization.lecture2;

public class StudentDetails {

    static void main(String[] args) {

        Student student = new Student("J54", "John DOn", "Java");
        StudentDetailsThread sdt = new StudentDetailsThread(student);
        CourseDetailsThread cdt = new CourseDetailsThread(student);

        sdt.start();
        cdt.start();

    }
}

class Student {
    String studentId;
    String studentName;
    String course;

    public Student(String studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }
}

class StudentDetailsThread extends Thread {
    public Student s;

    public StudentDetailsThread(Student s) {
        this.s = s;
    }

    public void run() {
        System.out.println("Student ID :" + s.studentId +
                "\nStudent Name :" + s.studentName);
    }
}

class CourseDetailsThread extends Thread {
    public Student s;

    public CourseDetailsThread(Student s) {
        this.s = s;
    }

    public void run() {
        System.out.println("Course Name :" + s.course);
    }
}