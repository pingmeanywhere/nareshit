package corejava.part2.modifiers.lab;

import java.util.Scanner;

public class HotelRoomBookingSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String roomNumber = sc.nextLine();
        int pricePerNight = Integer.parseInt(sc.nextLine());
        int nights = Integer.parseInt(sc.nextLine());

        if (nights <= 0) {
            System.out.println("Error: Number of nights must be at least 1");
            return;
        }

        Room room = new Room(roomNumber, "Deluxe", pricePerNight);

        room.printRoomDetails();
        System.out.println("Total Cost for " + nights +
                " nights: " + room.calculateTotalCost(nights));
    }
}

class Room {
    String roomNumber;
    String roomType;
    double pricePerNight;

    public Room(String roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    protected double calculateTotalCost(int nights) {
        return pricePerNight * nights;
    }

    protected void printRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Night: " + pricePerNight);
    }
}
