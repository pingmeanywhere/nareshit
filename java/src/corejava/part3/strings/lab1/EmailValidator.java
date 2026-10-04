package corejava.part3.strings.lab1;

import java.util.Scanner;

public class EmailValidator {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();

        if (email.indexOf('@') != -1) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Invalid email: missing '@' symbol.");
        }

    }
}
