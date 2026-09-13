package corejava.part2.inheritance.lab2;

import java.util.Scanner;

public class StudentNameOverride {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        StudentDetails studentDetails = new StudentDetails(name);
        studentDetails.displayParentName();
    }
}


class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class StudentDetails extends Student {
    private String name;

    public StudentDetails(String name) {
        super(name);
    }

    public void displayParentName() {
        System.out.println("Parent Name: " + super.getName());
    }
}