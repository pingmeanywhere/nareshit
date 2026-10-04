package corejava.part3.classTypes.lab1;

import java.util.Scanner;

public class ParkingSlotSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mallName = sc.nextLine();
        int totalSlots = Integer.parseInt(sc.nextLine());
        int occupiedSlots = Integer.parseInt(sc.nextLine());

        if (occupiedSlots > totalSlots) {
            System.out.println("Error: Occupied slots cannot exceed total slots");
            return;
        }

        ParkingLot parkingLot = new ParkingLot(mallName, totalSlots, occupiedSlots);

        System.out.println("Mall: " + parkingLot.mallName);
        System.out.println("Available parking slots: " +
                ParkingLot.SlotCalculator.calculateAvailableSlots(
                        parkingLot.totalSlots, parkingLot.occupiedSlots));


    }
}

class ParkingLot {
    String mallName;
    int totalSlots;
    int occupiedSlots;

    public ParkingLot(String mallName, int totalSlots, int occupiedSlots) {
        this.mallName = mallName;
        this.totalSlots = totalSlots;
        this.occupiedSlots = occupiedSlots;
    }

    static class SlotCalculator {
        static int calculateAvailableSlots(int totalSlots, int occupiedSlots) {
            return totalSlots - occupiedSlots;
        }
    }
}