package corejava.part3.deadlock.raiwayBookingSystem;

import java.util.Arrays;
import java.util.Scanner;

public class OnlineRailwayReservationSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bookedSeats = new int[5];
        while (true) {
            System.out.println("Before Operation : " + Arrays.toString(bookedSeats));
            System.out.println("Enter 1 for exit or any number to continue");
            int exit = Integer.parseInt(sc.nextLine());
            if (exit == -1) {
                break;
            } else {
                System.out.println("Enter passenger ID");
                int passengerId = Integer.parseInt(sc.nextLine());
                System.out.println("Enter BOOK OR CANCEL to choose the operation");
                String operation = sc.nextLine();
                try {
                    RailwayReservation railwayReservation = new RailwayReservation(bookedSeats, 5);
                    Passenger passenger = new Passenger(railwayReservation, passengerId, operation);
                    passenger.start();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("After Operation : " + Arrays.toString(bookedSeats));
                }
            }

        }
    }
}

class RailwayReservation {
    public int availableSeats;
    public int[] bookedSeats;

    public RailwayReservation(int[] bookedSeats, int availableSeats) {
        this.bookedSeats = bookedSeats;
        this.availableSeats = availableSeats;
    }

    public synchronized void bookSeat(int passengerId) throws SeatNotFoundException {

        int emptySeatIndex = isSeatAvailable();
        System.out.println("Index for empty seat : " + emptySeatIndex);

        if (emptySeatIndex == -1) {
            throw new SeatNotFoundException("Seat is already full. Please try tomorrow");
        }

        bookedSeats[emptySeatIndex] = passengerId;
        availableSeats = availableSeats - 1;

        System.out.println("Seat No : " + emptySeatIndex + " is booked by : " + passengerId);

    }

    public synchronized void cancelSeat(int passengerId) throws BookingNotFoundException {

        int seatIndex = getPassengerSeatNo(passengerId);
        if (seatIndex == -1) {
            throw new BookingNotFoundException("No tickets found for passenger with ID : " + passengerId);
        }
        bookedSeats[seatIndex] = 0;
        availableSeats = availableSeats + 1;

        System.out.println("Ticket with book ID: " + seatIndex + " has been canceled by " + passengerId);

    }


    private int getPassengerSeatNo(int passengerId) {

        for (int i = 0; i < bookedSeats.length; i++) {
            if (bookedSeats[i] == passengerId) {
                return i;
            }
        }

        return -1;
    }

    private int isSeatAvailable() {

        for (int i = 0; i < bookedSeats.length; i++) {
            if (bookedSeats[i] == 0) {
                System.out.println("Empty Seat Check : " + i);
                return i;
            }
        }

        return -1;
    }
}

