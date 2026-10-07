package corejava.part3.exceptions;

import java.util.Scanner;

public class NumberFormatExceptionDemonstration {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();

        try {
            int nums = Integer.parseInt(number);
            System.out.println("Converted Number: " + nums);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

    }
}
