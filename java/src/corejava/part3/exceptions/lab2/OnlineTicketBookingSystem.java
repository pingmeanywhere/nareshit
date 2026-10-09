package corejava.part3.exceptions.lab2;

import java.util.Scanner;

public class OnlineTicketBookingSystem {

    static void processCancelation(int ticketId) throws TicketAlreadyCancelledException {
        if (ticketId == 101) {
            throw new TicketAlreadyCancelledException("TicketAlreadyCancelledException: " +
                    "Ticket 101 already cancelled");
        }
        System.out.println("Ticket cancelled successfully");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketId = sc.nextInt();

        try {
            processCancelation(ticketId);
        } catch (TicketAlreadyCancelledException e) {
            System.out.println(e.getMessage());
        }
    }
}

class TicketAlreadyCancelledException extends Exception {
    TicketAlreadyCancelledException(String message) {
        super(message);
    }
}