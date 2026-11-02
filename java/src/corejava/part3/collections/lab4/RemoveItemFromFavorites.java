package corejava.part3.collections.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveItemFromFavorites {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");

        String removable = sc.nextLine();

        if(!movies.contains(removable)) {
            System.out.println("Item not found");
        } else {
            movies.remove(removable);
            System.out.println("Updated favorites: " + movies);
        }

    }
}
