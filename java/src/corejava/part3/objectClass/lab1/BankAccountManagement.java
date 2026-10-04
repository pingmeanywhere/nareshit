package corejava.part3.objectClass.lab1;

import java.util.Objects;
import java.util.Scanner;

public class BankAccountManagement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String accountNumber1 = sc.nextLine();
        String accountType1 = sc.nextLine();
        String accountHolder1 = sc.nextLine();
        double balance1 = Double.parseDouble(sc.nextLine());

        String accountNumber2 = sc.nextLine();
        String accountType2 = sc.nextLine();
        String accountHolder2 = sc.nextLine();
        double balance2 = Double.parseDouble(sc.nextLine());

        if (balance1 < 0 || balance2 < 0) {
            System.out.println("Error: Balance must be non-negative");
            return;
        }

        BankAccount bankAccount1 = new BankAccount(accountNumber1, accountType1, accountHolder1, balance1);
        BankAccount bankAccount2 = new BankAccount(accountNumber2, accountType2, accountHolder2, balance2);

        if (bankAccount1.equals(bankAccount2)) {
            System.out.println("Accounts are equal");
        } else {
            System.out.println("Accounts are not equal");
        }

    }
}

class BankAccount {
    String accountNumber;
    String accountType;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountType,
                       String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public boolean equals(Object obj) {
        if (obj.getClass() != BankAccount.class) return false;
        BankAccount bankAccount = (BankAccount) obj;

        return Objects.equals(this.accountNumber, bankAccount.accountNumber)
                && Objects.equals(this.accountType, bankAccount.accountType);
    }
}
