package corejava.part3.collections.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEquality {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> playlist1 = new ArrayList<>();
        ArrayList<String> playlist2 = new ArrayList<>();

        int size1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size1; i++) {
            playlist1.add(sc.nextLine().trim());
        }
        int size2 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size2; i++) {
            playlist2.add(sc.nextLine().trim());
        }

        if (playlist1.equals(playlist2)) {
            System.out.println("Playlists are same: true");
        } else {
            System.out.println("Playlists are same: false");
        }
    }
}
