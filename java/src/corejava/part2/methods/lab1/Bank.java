package corejava.part2.methods.lab1;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {

    String name;
    double money;
    int accountNumber;
    static  HashMap<String, Double> details = new HashMap<>();

    Bank (String name, double money) {
        this.name = name;
        this.money = money;
        details.put(name, money);
    }

    double getMoneyDetails (String name) {
        return details.get(name);
    }
    // withdraw , deposit, show details
    static int withdraw(int amount) {

        int remaining = 0;



        return remaining;
    }

    static  int deposit (int amount) {
        int total = 0;


        return total;
    }

    static  void createYourAccount (String name, double initialAmount) {

        Bank user = new Bank(name, initialAmount);

        System.out.println("Your acount has been created.");
        System.out.println("DETAILS : ");
        System.out.println("NAME : " + user.name);
        System.out.println("MONEY : " + user.money);


    }

    static  void checkDetails (String name) {
        System.out.println("NAME : " + name);
        System.out.println("REMAINING AMOUNT : " + details.get(name));
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("What do you want : \n Create Account -> 1, " +
                    "\n Show Details -> 2, " +
                    "\n Withdraw -> 3, " +
                    "\n Deposit -> 4, " +
                    "\n type any other number to exit -> , ");

            int option = sc.nextInt();

            if(option == 1) {
                System.out.println("Enter your name : ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter initial amount : ");
                double amount = sc.nextDouble();
                createYourAccount(name, amount);

            } else if  (option == 2) {

                System.out.println("Enter your name : ");
                sc.nextLine();
                String name = sc.nextLine();
                checkDetails(name);

            } else if (option == 3) {

            } else if (option == 4) {

            } else {
                break;
            }
        } while (true);

    }
}
