package corejava.part3.collections.lecture7;

import java.util.Hashtable;
import java.util.Scanner;

public class HospitalPatientAndAppointment {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospital hospital = new Hospital();

        System.out.println("Enter number of patients : ");
        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.println("Enter patient id, name, age and disease details : ");
            hospital.registerPatient(new Patient(Integer.parseInt(sc.nextLine()),
                    sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }

        System.out.println(hospital);

        System.out.println("Update disease : id and disease name : ");

        int id = Integer.parseInt(sc.nextLine());
        String disease = sc.nextLine();

        hospital.updateDisease(id, disease);

        System.out.println("Display update patient : ");
        hospital.displayPatient(id);

        System.out.println("Enter new id to change id ");
        int newId = Integer.parseInt(sc.nextLine());

        hospital.transferPatient(id, newId);

        System.out.println("Display New Id patient");
        hospital.displayPatient(newId);

        System.out.println("Check if old id patient still available or not");
        hospital.displayPatient(id);
    }
}

class Patient {
    int id;
    String name;
    int age;
    String disease;


    public Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                '}';
    }
}

class Hospital {
    Hashtable<Integer, Patient> hospitals;

    public Hospital() {
        this.hospitals = new Hashtable<>();
    }

    public void registerPatient(Patient patient) {
        hospitals.put(patient.id, patient);
        System.out.println("Patient registered successfullyz");
    }

    public void updateDisease(int id, String disease) {
        if (hospitals.containsKey(id)) {
            hospitals.get(id).disease = disease;
            System.out.println("Patient disease change to : " + disease);
        } else {
            System.out.println("Patient is not registered in this hospital");
        }
    }

    public void transferPatient(int oldId, int newId) {
        if (!hospitals.containsKey(oldId)) {
            System.out.println("Patient not found");
        }
        if (hospitals.containsKey(newId)) {
            System.out.println("New Id already exists");
        } else {
            hospitals.put(newId, hospitals.get(oldId));
            hospitals.get(newId).id = newId;
            System.out.println("Patient transfered successfully to id " + newId);
            hospitals.remove(oldId);
        }
    }

    public void displayPatient(int id) {
        if (hospitals.containsKey(id)) {
            System.out.println(hospitals.get(id));
        } else {
            System.out.println("Patient is not registered in this hospital");
        }
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitals=" + hospitals +
                '}';
    }
}