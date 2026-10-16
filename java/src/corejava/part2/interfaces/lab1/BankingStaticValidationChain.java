package corejava.part2.interfaces.lab1;

import java.util.Scanner;

public class BankingStaticValidationChain {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        long accountNo = Long.parseLong(input.trim().split(" ")[0]);
        long amount = Long.parseLong(input.trim().split(" ")[1]);

        BankValidator.isValidAmount(amount);

        if (BankValidator.isValidAccount(accountNo) && BankValidator.isValidAmount(amount)) {
            System.out.println("Transaction Allowed");
        } else {
            System.out.println("Transaction Denied");
        }


    }
}

interface BankValidator {
    static boolean isValidAccount(long accNo) {
        return (String.valueOf(accNo).length() >= 10);
    }

    static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}