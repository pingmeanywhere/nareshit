package corejava.part3.exceptions.lab1;

import java.util.Scanner;

public class EnhancedPasswordAuthenticationSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        try {
            Password.validate(password);
        } catch (InvalidPassword e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidPassword extends Exception {
    InvalidPassword(String message) {
        super(message);
    }
}

class Password {
    public static void validate(String password) throws InvalidPassword {

        if (!password.matches(".*[0-9].*")) {
            throw new InvalidPassword("Password must contain at least one digit");
        }

        if (password.length() < 8) {
            throw new InvalidPassword("Password must be at least 8 characters");
        }

        System.out.println("Authentication successful");
    }
}
