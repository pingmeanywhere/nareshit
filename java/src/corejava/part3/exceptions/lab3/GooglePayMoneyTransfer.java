package corejava.part3.exceptions.lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GooglePayMoneyTransfer {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            int balance = Integer.parseInt(sc.nextLine());
            int amount = Integer.parseInt(sc.nextLine());
            System.out.println(balance + amount);
            String upiPin = sc.nextLine();


            if (upiPin.length() != 4) {
                throw new StringIndexOutOfBoundsException("Invalid PIN");
            }

            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance");
            }

            balance = balance - amount;

            System.out.println("Transfer Successful \n" +
                    "Remaining Balance: " + balance);
        } catch (InputMismatchException | StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }
}
