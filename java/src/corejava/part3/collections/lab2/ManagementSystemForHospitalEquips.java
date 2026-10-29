package corejava.part3.collections.lab2;

import java.util.Scanner;
import java.util.Vector;

public class ManagementSystemForHospitalEquips {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospital hospital = new Hospital();

        System.out.println("Enter numbers of equipments");
        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.println("Enter equipment ID");
            int equipmentId = Integer.parseInt(sc.nextLine());
            System.out.println("Enter equipment Name ");
            String equipmentName = sc.nextLine();

            hospital.addEquipment(new MedicalEquipment(equipmentId, equipmentName));
        }

        System.out.println("Issue equipment : ");
        hospital.issueEquipment(Integer.parseInt(sc.nextLine()));

        System.out.println("Issue equipment again : ");
        hospital.issueEquipment(Integer.parseInt(sc.nextLine()));

        System.out.println("Return equipment : ");
        hospital.returnEquipment(Integer.parseInt(sc.nextLine()));

        System.out.println("Display All equipment : ");
        hospital.displayAllEquipment();

    }
}

class MedicalEquipment {
    int equipmentId;
    String equipmentName;
    boolean available = true;

    public MedicalEquipment(int equipmentId, String equipmentName) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
    }

    public boolean issueEquipment() {
        if (available) {
            available = false;
            return true;
        }

        return false;
    }

    public void returnEquipment() {
        if (!available) {
            this.available = true;
        }
    }

    public void displayEquipment() {
        System.out.println("ID : " + equipmentId);
        System.out.println("NAME : " + equipmentName);
        System.out.println("AVAILABILITY : " + available);
    }
}


class Hospital {
    Vector<MedicalEquipment> equipments;


    public Hospital() {
        this.equipments = new Vector<>();
    }

    public void addEquipment(MedicalEquipment equipment) {
        equipments.add(equipment);
    }

    public void issueEquipment(int equipmentId) {

        MedicalEquipment equipment = getMedicalEquipment(equipmentId);
        if (equipment == null) {
            System.out.println("Equipment not found.");
        } else if (!equipment.available) {
            System.out.println("Equipment is currently unavailable.");
        } else {
            equipment.issueEquipment();
            System.out.println("Equipment issued successfully.");
        }
    }

    public void returnEquipment(int equipmentId) {
        MedicalEquipment equipment = getMedicalEquipment(equipmentId);
        if (equipment == null) {
            System.out.println("Equipment not found.");
        } else if (equipment.available) {
            System.out.println("Equipment is already available.");
        } else {
            equipment.returnEquipment();
            System.out.println("Equipment returned successfully.");
        }

    }

    public void displayAllEquipment() {
        for (MedicalEquipment m : equipments) {
            m.displayEquipment();
            System.out.println();
        }
    }


    // helper methods
    private MedicalEquipment getMedicalEquipment(int equipmentId) {
        for (MedicalEquipment m : equipments) {
            if (m.equipmentId == equipmentId) {
                return m;
            }
        }

        return null;
    }

}


