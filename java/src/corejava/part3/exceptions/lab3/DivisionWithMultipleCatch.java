package corejava.part3.exceptions.lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWithMultipleCatch {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            int nomin = Integer.parseInt(sc.nextLine().trim());
            int denom = Integer.parseInt(sc.nextLine().trim());
            if (denom == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            System.out.println("Result: " + nomin / denom);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input type");
        }
    }
}
