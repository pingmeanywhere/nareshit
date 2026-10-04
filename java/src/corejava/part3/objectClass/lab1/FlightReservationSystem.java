package corejava.part3.objectClass.lab1;

import java.util.Objects;
import java.util.Scanner;

public class FlightReservationSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String seatNumber1 = sc.nextLine();
        String passengerName1 = sc.nextLine();
        String travelClass1 = sc.nextLine();

        String seatNumber2 = sc.nextLine();
        String passengerName2 = sc.nextLine();
        String travelClass2 = sc.nextLine();

        if (seatNumber1.length() < 2 || seatNumber1.length() > 5 || seatNumber2.length() < 2 || seatNumber2.length() > 5) {
            System.out.println("Error: Seat number length must be between 2 and 5");
            return;
        }

        FlightSeat flight1 = new FlightSeat(seatNumber1, passengerName1, travelClass1);

        FlightSeat flight2 = new FlightSeat(seatNumber2, passengerName2, travelClass2);

        System.out.println("Seat1 hashCode: " + flight1.hashCode());
        System.out.println("Seat2 hashCode: " + flight2.hashCode());

        if (flight1.hashCode() == flight2.hashCode()) {
            System.out.println("Hash codes are equal");
        } else {
            System.out.println("Hash codes are different");
        }


    }
}


class FlightSeat {
    private String seatNumber;
    private String passengerName;
    private String travelClass;

    FlightSeat(String seatNumber, String passengerName, String travelClass) {
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
        this.travelClass = travelClass;
    }

    public int hashCode() {
        return Objects.hashCode(seatNumber);
    }

}
