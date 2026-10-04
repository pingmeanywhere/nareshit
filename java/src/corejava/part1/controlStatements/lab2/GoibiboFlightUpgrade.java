package corejava.part1.controlStatements.lab2;

import java.util.Scanner;

public class GoibiboFlightUpgrade {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentSeat = sc.nextInt();
        int requestedSeat = sc.nextInt();
        int wallet = sc.nextInt();
        int upgradeFee = sc.nextInt();
        int time = sc.nextInt();

        if (requestedSeat > currentSeat && wallet >= upgradeFee && time <= 24) {
            System.out.println("Upgrade Successful");
        } else {
            System.out.println("Upgrade Failed");
        }

    }
}
