package corejava.part3.lambdaExpression.lab2;

import java.util.Scanner;
import java.util.function.Predicate;

public class FilterUsersByCity {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().trim());

        String[] locations = new String[size];

        for (int i = 0; i < locations.length; i++) {
            locations[i] = sc.nextLine().trim();
        }

        Predicate<String> isNewYork = Predicate.isEqual("New York");

        boolean notMatchFound = true;
        for (String s : locations) {
            if (isNewYork.test(s)) {
                System.out.println(s);
                notMatchFound = false;
            }
        }

        if (notMatchFound) {
            System.out.println("No matches found.");
        }
    }
}


