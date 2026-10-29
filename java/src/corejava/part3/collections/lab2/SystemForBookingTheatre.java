package corejava.part3.collections.lab2;

import java.util.Scanner;
import java.util.Vector;

public class SystemForBookingTheatre {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CinemaTheatre cinemaTheatre = new CinemaTheatre();


        System.out.println("Enter seat number to book");
        cinemaTheatre.bookSeat(sc.nextInt());

        System.out.println("Enter seat number to book again ");
        cinemaTheatre.bookSeat(sc.nextInt());


        System.out.println("Enter seat number to cancel");
        cinemaTheatre.cancelBooking(sc.nextInt());

        System.out.println("Dispaly all seats");
        cinemaTheatre.displayAllSeats();

    }
}


class Seat {
    int seatNumber;
    boolean booked = false;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean bookSeat() {
        if (!booked) {
            booked = true;
            return true;
        }

        return false;
    }

    public boolean cancelBooking() {
        if (booked) {
            booked = false;
            return true;
        }
        return false;
    }

    public void displaySeat() {
        System.out.println("Seat NO   : " + seatNumber);
        System.out.println("Booked : " + booked);
    }
}

class CinemaTheatre {
    Vector<Seat> seats;

    public CinemaTheatre() {
        seats = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            seats.add(new Seat(i));
        }
    }

    public void bookSeat(int seatNumber) {

        Seat seat = getSeat(seatNumber);
        if (seat == null) {
            System.out.println("Invalid seat number.");
        } else if (seat.booked) {
            System.out.println("Seat is already booked.");
        } else {
            seat.bookSeat();
            System.out.println("Seat : " + seatNumber + " booked successfully");
        }

    }

    public void cancelBooking(int seatNumber) {

        Seat seat = getSeat(seatNumber);
        if (seat == null) {
            System.out.println("Invalid seat number.");
        } else if (!seat.booked) {
            System.out.println("Seat is not booked.");
        } else {
            seat.cancelBooking();
            System.out.println("Seat : " + seatNumber + " canceled successfully");
        }


    }

    public void displayAllSeats() {
        for (Seat s : seats) {
            s.displaySeat();
            System.out.println();
        }
    }

    // Helper Methods
    private Seat getSeat(int seatNumber) {
        for (Seat s : seats) {
            if (s.seatNumber == seatNumber) {
                return s;
            }
        }

        return null;
    }
}