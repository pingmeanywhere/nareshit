package corejava.part3.exceptions.lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceCenterManagementSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            while (true) {

                // Registered user
                boolean onlyInput = true;
                int choice = Integer.parseInt(sc.nextLine().trim());
                int custId;
                if (choice == 1) {
                    custId = Integer.parseInt(sc.nextLine().trim());
                    String custName = sc.nextLine().trim();
                    System.out.println("Customer registered successfully ");
                }

                // Choose service type
                choice = Integer.parseInt(sc.nextLine().trim());
                if (choice == 2) {
                    int newId = Integer.parseInt(sc.nextLine().trim());
                    String serviceType = sc.nextLine().trim();
                    if (!serviceType.equals("Repair")) {
                        throw new InputMismatchException("Invalid service type");
                    }

                    System.out.println("Service booked: " + serviceType);
                    onlyInput = false;
                }


                // Generate bill
                if (!onlyInput) {
                    choice = Integer.parseInt(sc.nextLine().trim());
                }
                if (choice == 3) {
                    int newId = Integer.parseInt(sc.nextLine().trim());
                    int amount = Integer.parseInt(sc.nextLine().trim());

                    if (amount < 0) {
                        throw new InputMismatchException("Invalid service cost");
                    }

                    System.out.println("Service bill generated: " + amount);
                    onlyInput = false;
                }


                // Exit from the loop
                choice = Integer.parseInt(sc.nextLine().trim());
                if (choice == 4) {
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exiting Service Center System");
        }


    }
}




