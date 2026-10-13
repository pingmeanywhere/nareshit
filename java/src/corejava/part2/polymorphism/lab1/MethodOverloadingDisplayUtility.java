package corejava.part2.polymorphism.lab1;

import java.util.Scanner;

public class MethodOverloadingDisplayUtility {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = Integer.parseInt(sc.nextLine().trim());

        switch (choice) {
            case 1 -> {
                ConsoleOutput.display(Integer.parseInt(sc.nextLine().trim()));
            }
            case 2 -> {
                ConsoleOutput.display(Double.parseDouble(sc.nextLine().trim()));
            }
            default -> {
                ConsoleOutput.display(sc.nextLine().trim());
            }
        }
        ;

    }
}

class ConsoleOutput {
    public static void display(int value) {
        System.out.println("Integer Value: " + value);
    }

    public static void display(double value) {
        System.out.println("Double Value: " + value);
    }

    public static void display(String value) {
        System.out.println("String Value: " + value);
    }
}