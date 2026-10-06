package corejava.part3.objectClass.lab2;

import java.util.Scanner;

public class UniversityStudentProfileSystem {

    static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);

        String studentId = sc.nextLine();
        String studentName = sc.nextLine();
        String city = sc.nextLine();
        String country = sc.nextLine();
        double gpa = Double.parseDouble(sc.nextLine());

        if (studentId.length() < 3 || studentId.length() > 10 || studentName.length() < 3 ||
                studentName.length() > 20 || city.length() < 2 || city.length() > 20) {
            System.out.println("Invalid input");
            return;
        }

        StudentProfile studentProfile = new StudentProfile(studentId,
                studentName, new Address(city, country), gpa);
        System.out.println("Original Student: " + studentProfile);
        StudentProfile cloneStudent = (StudentProfile) studentProfile.clone();

        cloneStudent.address.city = "Milan";
        cloneStudent.gpa = cloneStudent.gpa + 0.5;

        System.out.println("Cloned Student: " + cloneStudent);

    }
}


class Address implements Cloneable {

    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public Object clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    public String toString() {
        return city + " " + country;
    }
}

class StudentProfile implements Cloneable {
    String studentId;
    String studentName;
    Address address;
    double gpa;


    public StudentProfile(String studentId, String studentName, Address address, double gpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.gpa = gpa;
    }

    public Object clone() throws CloneNotSupportedException {
        StudentProfile copy = (StudentProfile) super.clone();
        copy.address = (Address) address.clone();
        return copy;
    }

    public String toString() {
        return studentId + " " + studentName + " " + address + " " + gpa;
    }
}