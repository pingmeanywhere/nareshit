package corejava.part2.inheritance.lab2;

import java.util.Scanner;

public class OnlineMovieTickPricing {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = Integer.parseInt(sc.nextLine());
        int ticketId = Integer.parseInt(sc.nextLine());
        String movieName = sc.nextLine();
        int basePrice = Integer.parseInt(sc.nextLine());

        Ticket ticket = switch (choice) {
            case 1 -> new RegularTicket(ticketId, movieName, basePrice);
            case 2 -> new PremiumTicket(ticketId, movieName, basePrice);
            case 3 -> new IMAXTicket(ticketId, movieName, basePrice);
            default -> null;
        };

        System.out.println("Final Price: " + ticket.calculateFinalPrice());
        ;

    }
}

class Ticket {
    private int ticketId;
    private String movieName;
    private int basePrice;

    public Ticket(int ticketId, String movieName, int basePrice) {
        this.ticketId = ticketId;
        this.movieName = movieName;
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int calculateFinalPrice() {
        return 0;
    }
}

class RegularTicket extends Ticket {
    public RegularTicket(int ticketId, String movieName, int basePrice) {
        super(ticketId, movieName, basePrice);
    }

    public int calculateFinalPrice() {
        return this.getBasePrice() + (this.getBasePrice() * 5 / 100);
    }
}

class PremiumTicket extends RegularTicket {

    public PremiumTicket(int ticketId, String movieName, int basePrice) {
        super(ticketId, movieName, basePrice);
    }

    public int calculateFinalPrice() {
        return this.getBasePrice() + (this.getBasePrice() * 12 / 100);
    }
}

class IMAXTicket extends RegularTicket {

    public IMAXTicket(int ticketId, String movieName, int basePrice) {
        super(ticketId, movieName, basePrice);
    }

    public int calculateFinalPrice() {
        return this.getBasePrice() + 250;
    }
}