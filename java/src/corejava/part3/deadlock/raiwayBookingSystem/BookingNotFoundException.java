package corejava.part3.deadlock.raiwayBookingSystem;

class BookingNotFoundException extends Exception {
    BookingNotFoundException(String message) {
        super(message);
    }
}
