package corejava.part3.deadlock.raiwayBookingSystem;

public class Passenger extends Thread {
    RailwayReservation railwayReservation;
    int passengerId;
    String operation;

    Passenger(RailwayReservation railwayReservation, int passengerId, String operation) {
        this.railwayReservation = railwayReservation;
        this.passengerId = passengerId;
        this.operation = operation;
    }

    public void run() {

        if (operation.equalsIgnoreCase("BOOK")) {
            try {
                Thread.sleep(500);
                railwayReservation.bookSeat(passengerId);
            } catch (SeatNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } else if (operation.equalsIgnoreCase("CANCEL")) {
            try {
                Thread.sleep(500);
                railwayReservation.cancelSeat(passengerId);
            } catch (BookingNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
