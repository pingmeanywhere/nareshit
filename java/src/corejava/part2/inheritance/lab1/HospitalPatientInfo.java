package corejava.part2.inheritance.lab1;

import java.util.Scanner;

public class HospitalPatientInfo {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String status = sc.nextLine();

        Checkup checkup = new Checkup(name, status);
        checkup.displayCheckupStatus();

    }
}


class Patient {
    private  String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class  Checkup extends  Patient {
    private  String status;

    public Checkup(String name, String status) {
        super(name);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public  void displayCheckupStatus() {
        System.out.println("Checkup " + this.getStatus());
    }
}