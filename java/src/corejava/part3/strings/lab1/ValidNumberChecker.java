package corejava.part3.strings.lab1;

import java.util.Scanner;

public class ValidNumberChecker {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        for (int i = 0; i < number.length(); i++) {
            if (Character.isAlphabetic(number.charAt(i))) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
