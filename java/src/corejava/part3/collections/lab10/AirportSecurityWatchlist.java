package corejava.part3.collections.lab10;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class AirportSecurityWatchlist {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine().strip();

        int size = Integer.parseInt(sc.nextLine().strip());
        AirportSecurity airportSecurity = new AirportSecurity(name);

        for (int i = 0; i < size; i++) {
            String word = sc.nextLine().strip();
            if (word.contains("ENTER")) {
                airportSecurity.scanEntry(word.split(" ")[1]);
            }
            if (word.contains("REMOVE")) {
                airportSecurity.removePassenger(word.split(" ")[1]);
            }
        }

        airportSecurity.displayStatus();

    }
}

class AirportSecurity {
    String name;
    LinkedHashSet<String> insidePassengers;
    LinkedHashSet<String> watchList;

    public AirportSecurity(String name) {
        this.name = name;
        this.insidePassengers = new LinkedHashSet<>();
        this.watchList = new LinkedHashSet<>();
    }

    public void scanEntry(String passportNo) {
        if (watchList.contains(passportNo)) {
            System.out.println("Security Alert: Passenger Blocked");
        } else if (!insidePassengers.contains(passportNo)) {
            insidePassengers.add(passportNo);
        }
    }

    public void removePassenger(String passportNo) {
        if (insidePassengers.contains(passportNo)) {
            insidePassengers.remove(passportNo);
            watchList.add(passportNo);
        }
    }

    public void displayStatus() {
        System.out.println("Airport Name: " + this.name);

        System.out.print("Passengers Inside: ");
        for (String s : insidePassengers) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.print("Watchlist: ");
        for (String s : watchList) {
            System.out.print(s + " ");
        }
    }
}
