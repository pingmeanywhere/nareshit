package corejava.part2.polymorphism.lab2;

import java.util.Scanner;

public class CloudResourceBillingSystem {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int hoursUsed = sc.nextInt();
        int dataTransferGB = sc.nextInt();
        boolean peakHours = sc.nextBoolean();
        if (hoursUsed <= 0) {
            System.out.println("Error: Hours used must be greater than 0");
            return;
        }

        double totalBill = 0;

        if (choice == 1) {
            BasicCompute basicCompute = new BasicCompute();
            totalBill = basicCompute.calculateBill(hoursUsed, dataTransferGB, peakHours);
        } else if (choice == 2) {
            PremiumCompute premiumCompute = new PremiumCompute();
            totalBill = premiumCompute.calculateBill(hoursUsed, dataTransferGB, peakHours);
        }

        System.out.println("Total Cloud Bill: " + totalBill);


    }
}

interface CloudService {
    double calculateBill(int hoursUsed, double dataTransferGB, boolean peakHours);
}

class BasicCompute implements CloudService {
    public double calculateBill(int hoursUsed, double dataTransferGB, boolean peakHours) {
        double usage = (hoursUsed * 15) + (dataTransferGB * 5);
        double surcharge = 0;
        if (peakHours) {
            surcharge = usage * 0.1;
        }
        return (200 + (usage + surcharge));
    }
}

class PremiumCompute implements CloudService {
    public double calculateBill(int hoursUsed, double dataTransferGB, boolean peakHours) {
        double usage = (hoursUsed * 30) + (dataTransferGB * 8);
        double surcharge = 0;
        if (peakHours) {
            surcharge = usage * 0.2;
        }
        return 500 + (usage + surcharge);
    }
}