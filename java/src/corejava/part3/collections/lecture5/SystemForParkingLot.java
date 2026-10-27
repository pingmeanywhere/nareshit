package corejava.part3.collections.lecture5;

import java.util.Scanner;
import java.util.Vector;

public class SystemForParkingLot {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ParkingLot parkingLot = new ParkingLot();

        while (true) {
            System.out.println("Enter slot number");
            int slotNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Enter vehicle number");
            String vehicleNumber = sc.nextLine();
            if (slotNumber == 0) {
                break;
            }
            parkingLot.parkVehicle(slotNumber, vehicleNumber);
        }


    }
}

class ParkingSlot {
    int slotNumber;
    String vehicleNumber = "";
    boolean occupied = false;


    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean parkVehicle(String vehicleNumber) {
        if (!occupied) {
            this.vehicleNumber = vehicleNumber;
            this.occupied = true;
            return true;
        }

        return false;
    }

    public void removeVehicle() {
        if (occupied) {
            this.vehicleNumber = "";
            this.occupied = false;
        }
    }

    public void displaySlot() {
        System.out.println("Slot Number :" + slotNumber);
        System.out.println("Vehicle Number :" + (vehicleNumber.isEmpty() ? "NO VEHICLE" : vehicleNumber));
        System.out.println("Occupied :" + occupied);
    }
}


class ParkingLot {
    Vector<ParkingSlot> slots = new Vector<>();


    public ParkingLot() {
        for (int i = 1; i <= 5; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    public void parkVehicle(int slotNumber, String vehicleNumber) {
        boolean slotNotFound = true;
        for (ParkingSlot p : slots) {
            if (p.slotNumber == slotNumber) {
                if (p.parkVehicle(vehicleNumber)) {
                    slotNotFound = false;
                    System.out.println("Vehicle Parked Successful");
                } else {
                    System.out.println("Slot is already occupied");
                    break;
                }
            }
        }
        if (slotNotFound) {
            System.out.println("Invalid slot number");
        }
    }
}
