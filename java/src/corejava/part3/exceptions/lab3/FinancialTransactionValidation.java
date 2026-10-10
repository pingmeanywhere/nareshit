package corejava.part3.exceptions.lab3;

import java.util.Scanner;

public class FinancialTransactionValidation {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int amount = Integer.parseInt(sc.nextLine().trim());
            long accountNumber = Long.parseLong(sc.nextLine().trim());
            new FinancialTransaction().processTransaction(amount, accountNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}

class FinancialTransaction {
    public void processTransaction(double amount, long accountNumber) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Error processing transaction:" +
                    " Transaction amount must be positive.");
        }
        System.out.println("Processing transaction... \n" +
                "Transaction successful: Amount Rs." + amount +
                " transferred to account " + accountNumber);
    }
}


