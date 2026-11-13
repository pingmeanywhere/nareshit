package corejava.part3.collections.lab9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EventParticipantManager {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().trim());

        EventManager em = new EventManager();

        for (int i = 0; i < size; i++) {
            ArrayList<String> participants = new ArrayList<>();
            ArrayList<String> canceled = new ArrayList<>();
            int total = Integer.parseInt(sc.nextLine().trim());
            for (int j = 0; j < total; j++) {
                String word = sc.nextLine();
                if (word.length() > 30) {
                    System.out.println("Error - Participant name too long");
                    return;
                }
                participants.add(word);
            }
            em.addEventParticipants(participants);
            String removable = sc.nextLine();
            canceled.add(removable);
            em.removeCancelledParticipants(canceled);
        }

        em.displayParticipants();
    }
}

class EventManager {
    ArrayList<String> participants;
    ArrayList<ArrayList<String>> eventParticipants;
    ArrayList<ArrayList<String>> cancelledParticipants;


    public EventManager() {
        this.participants = new ArrayList<>();
        this.eventParticipants = new ArrayList<ArrayList<String>>();
        this.cancelledParticipants = new ArrayList<ArrayList<String>>();
    }

    public void addEventParticipants(ArrayList<String> participants) {
        eventParticipants.add(participants);
    }

    public void removeCancelledParticipants(ArrayList<String> cancelled) {
        eventParticipants.remove(cancelled);
    }

    public void displayParticipants() {
        Iterator<ArrayList<String>> nested = eventParticipants.iterator();
        int count = 1;
        while (nested.hasNext()) {
            Iterator<String> i = nested.next().iterator();
            System.out.print("Event " + count + ": ");
            while (i.hasNext()) {
                System.out.print(i.next() + " ");
            }
            System.out.println();
            count++;
        }
    }
}