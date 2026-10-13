package corejava.part3.synchronization.lecture2;

public class OnlineTicketBookingSystem {

    static void main(String[] args) throws InterruptedException {

        TicketBooking tb = new TicketBooking();
        Customer a = new Customer("Aquib", 1, tb);
        Customer b = new Customer("Mirchi", 3, tb);
        Customer c = new Customer("Nimbu", 2, tb);
        a.setName("Aquib");
        b.setName("Mirchi");
        c.setName("Nimbu");

        a.start();
        b.start();
        c.start();

        a.join();
        b.join();
        c.join();

        System.out.println("Operation Complted");
        System.out.println("Remaining Tickets : " + tb.available);

    }
}

class TicketBooking {
    int available = 5;

    public synchronized void bookTicket(int requested) {
        if (requested <= available) {
            System.out.println(Thread.currentThread().getName() + " booked " + requested + " successfully");
            this.available = this.available - requested;
        } else {
            System.out.println("Booking failed for customer " + Thread.currentThread().getName());
        }
    }
}

class Customer extends Thread {
    String name;
    int ticket;
    TicketBooking tb;

    public Customer(String name, int ticket, TicketBooking tb) {
        this.name = name;
        this.ticket = ticket;
        this.tb = tb;
    }

    public void run() {
        tb.bookTicket(ticket);
    }
}
