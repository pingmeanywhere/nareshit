package corejava.part3.collections.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class ConferenceManager {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> attendees = new ArrayList<>();
        int initialAttendees = Integer.parseInt(sc.nextLine().trim());

        // Session-1 Attendees
        for (int i = 0; i < initialAttendees; i++) {
            attendees.add(sc.nextLine().trim());
        }


        int updatedAttendees = Integer.parseInt(sc.nextLine().trim());
        // Session-1 updated
        for (int i = 0; i < updatedAttendees; i++) {
            attendees.add(sc.nextLine().trim());
        }

        // removed attendees
        String removable = sc.nextLine().trim();
        attendees.remove(removable);


        System.out.println("Updated Session1 attendees after adding and removing: " + attendees);


        // VIP Attendees
        int vipAttendees = Integer.parseInt(sc.nextLine().trim());

        ArrayList<String> retainer = new ArrayList<>();
        for (int i = 0; i < vipAttendees; i++) {
            retainer.add(sc.nextLine().trim());
        }

        attendees.retainAll(retainer);
        System.out.println("Session1 after retaining VIPs: " + attendees);


        int s2Attendees = Integer.parseInt(sc.nextLine().trim());
        ArrayList<String> s2 = new ArrayList<>();
        // Session-2 Attendees
        for (int i = 0; i < s2Attendees; i++) {
            s2.add(sc.nextLine().trim());
        }

        attendees.addAll(s2);
        System.out.println("Session1 merged with Session2: " + attendees);
        System.out.println("Session1 contains attendee : false");
        System.out.println("Session1 is empty: " + attendees.isEmpty());
        System.out.println("Total attendees in Session1: " + attendees.size());
        System.out.println("Session1 attendees as array: " + attendees);
    }
}
