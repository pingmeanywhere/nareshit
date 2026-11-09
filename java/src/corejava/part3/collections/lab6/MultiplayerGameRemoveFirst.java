package corejava.part3.collections.lab6;

import java.util.LinkedList;
import java.util.Scanner;

public class MultiplayerGameRemoveFirst {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        LinkedList<String> players = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            players.add(sc.nextLine());
        }

        String removed = players.pollFirst();
        if (removed == null) {
            System.out.println("No players left ");
        } else {
            System.out.println("Player removed: " + removed);
        }

        System.out.println("Remaining players: " + players);
    }
}
