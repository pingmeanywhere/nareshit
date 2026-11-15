package corejava.part3.collections.lab10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckIfCityExists {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().strip());

        String[] cities = new String[size];

        for (int i = 0; i < cities.length; i++) {
            cities[i] = sc.nextLine().strip();
        }

        TravelAgency travelAgency = new TravelAgency(cities);

        String checkCity = sc.nextLine().strip();

        if (travelAgency.isCityAvailable(checkCity)) {
            System.out.println("Yes, we offer a tour to " + checkCity + ".");
        } else {
            System.out.println("Sorry, we do not offer a tour to " + checkCity + ".");
        }

    }
}

class TravelAgency {
    Set<String> cities;

    public TravelAgency(String[] cities) {
        this.cities = new HashSet<>(Arrays.asList(cities));
    }


    public boolean isCityAvailable(String city) {
        return cities.contains(city);
    }

}