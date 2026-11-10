package corejava.part3.collections.lab8;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MovieTicketRegister {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cinema cinema = new Cinema();

        int size = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < size; i++) {
            cinema.addBooking(new Booking(Integer.parseInt(sc.nextLine().trim()), sc.nextLine().trim()));
        }

        int searchId = Integer.parseInt(sc.nextLine().trim());
        cinema.display();
        cinema.searchBooking(searchId);


    }
}


class Booking {
    int id;
    String name;


    public Booking(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

class Cinema {
    LinkedHashMap<Integer, Booking> bookings;

    public Cinema() {
        bookings = new LinkedHashMap<>();
    }

    public void addBooking(Booking booking) {
        if (bookings.containsKey(booking.id)) {
            bookings.put(booking.id, booking);
        } else {
            bookings.put(booking.id, booking);
        }
    }

    public void display() {
        System.out.println("Booking List");
        for (Booking b : bookings.values()) {
            System.out.println(b);
        }
    }

    public void searchBooking(int id) {
        if (bookings.containsKey(id)) {
            System.out.println("Booking Found: " + bookings.get(id));
        } else {
            System.out.println("Booking not found");
        }
    }

}