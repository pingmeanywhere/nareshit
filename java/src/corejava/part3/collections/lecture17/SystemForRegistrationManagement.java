package corejava.part3.collections.lecture17;

import java.util.*;

public class SystemForRegistrationManagement {
    static void displayRegistrationReport(RegistrationManager rm) {
        System.out.println("Total Registration Attempts : " + rm.registrationAttempts.size());
        System.out.println("Unique Registrations : " + rm.countUniqueRegistrations());
        System.out.println("Duplicate Attempts : " + rm.countDuplicateAttempt());

        System.out.println("Unique Registration IDs :");
        rm.displayUniqueRegistrations();

    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        RegistrationManager rm = new RegistrationManager();

        for (int i = 0; i < size; i++) {
            rm.addRegistration(Integer.parseInt(sc.nextLine()));
        }
        displayRegistrationReport(rm);
    }
}


class RegistrationManager {
    Vector<Integer> registrationAttempts;
    HashSet<Integer> uniqueRegistrations;

    public RegistrationManager() {
        registrationAttempts = new Vector<>();
        uniqueRegistrations = new HashSet<>();
    }

    public void addRegistration(int id) {
        if (!uniqueRegistrations.contains(id)) {
            uniqueRegistrations.add(id);
        }
        registrationAttempts.add(id);
    }

    public int countDuplicateAttempt() {
        return registrationAttempts.size() - uniqueRegistrations.size();
    }

    public int countUniqueRegistrations() {
        return uniqueRegistrations.size();
    }

    public void displayUniqueRegistrations() {
        for (Integer i : uniqueRegistrations) {
            System.out.println(i);
        }
    }

    public int getMaximumFrequency() {
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : registrationAttempts) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Integer val : map.values()) {
            max = Math.max(val, max);
        }

        return max;
    }


    public int getMostFrequentRegistration() {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : registrationAttempts) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int id = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                id = entry.getKey();
            }
        }

        return id;
    }


}