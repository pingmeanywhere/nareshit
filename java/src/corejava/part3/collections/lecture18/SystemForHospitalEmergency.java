package corejava.part3.collections.lecture18;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class SystemForHospitalEmergency {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of patients :");
        int size = Integer.parseInt(sc.nextLine().strip());

        Queue<Patient> patients = new PriorityQueue<>(size, new PatientPriorityComparator());

        for (int i = 0; i < size; i++) {
            System.out.println("Enter ID, Name, Age and Priority of patient : ");
            patients.offer(new Patient(
                    Integer.parseInt(sc.nextLine().strip()),
                    sc.nextLine().strip(),
                    Integer.parseInt(sc.nextLine().strip()),
                    Integer.parseInt(sc.nextLine().strip())
            ));
        }

        for(Patient p : patients) {
            System.out.println(p + "\n");
        }

        System.out.println("NEXT PATIENT TO BE TREATED : ");
        System.out.println(patients.peek());

    }
}

class Patient {
    private int id;
    private String name;
    private int age;
    private int priority;


    public Patient(int id, String name, int age, int priority) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "ID : " + id +
                "\nNAME : " + name +
                "\nAGE : " + age +
                "\nPRIORITY : " + priority;
    }
}

class PatientPriorityComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {

        if (o1.getPriority() != o2.getPriority()) {
            return o1.getPriority() - o2.getPriority();
        }
        if (o1.getAge() != o2.getAge()) {
            return o2.getAge() - o1.getAge();
        }

        return o1.getId() - o2.getId();
    }
}
