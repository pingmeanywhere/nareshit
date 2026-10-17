package corejava.part3.deadlock.raiwayBookingSystem;

class SeatNotFoundException extends Exception {
    SeatNotFoundException(String message) {
        super(message);
    }
}
