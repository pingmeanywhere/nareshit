package corejava.part3.exceptions.lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PUBGLoginSystem {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            int userId = Integer.parseInt(sc.nextLine().trim());
            String password = sc.nextLine();

            if (password.length() < 6) {
                throw new InputMismatchException("Password too short");
            }

            System.out.println("Login Successful");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Player ID");
        }
    }
}
