package corejava.part3.collections.lab1;

import java.util.Scanner;
import java.util.Vector;

public class BusPassengerManagementSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().trim());

        Vector<Passenger> passengers = new Vector<>(size);

        for (int i = 0; i < passengers.capacity(); i++) {
            int passengerId = Integer.parseInt(sc.nextLine());
            String passengerName = sc.nextLine();
            double ticketFare = Double.parseDouble(sc.nextLine());
            if (ticketFare < 0) {
                System.out.println("Ticket fare must be greater than 0");
                return;
            }
            passengers.add(new Passenger(passengerId, passengerName, ticketFare));
        }

        double totalFare = 0;

        for (Passenger p : passengers) {
            System.out.println(p);
            totalFare += p.getTicketFare();
        }

        System.out.println("Total Fare Collected: " + totalFare);


    }
}

class Passenger {
    private int passengerId;
    private String passengerName;
    private double ticketFare;


    public Passenger(int passengerId, String passengerName, double ticketFare) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.ticketFare = ticketFare;
    }

    public String toString() {
        return passengerId + " " + passengerName + " " + ticketFare;
    }

    public double getTicketFare() {
        return ticketFare;
    }
}