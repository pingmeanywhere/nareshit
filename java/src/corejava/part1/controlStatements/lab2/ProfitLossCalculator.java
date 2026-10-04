package corejava.part1.controlStatements.lab2;

import java.util.Scanner;

public class ProfitLossCalculator {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cp = sc.nextInt();
        int sp = sc.nextInt();

        if(sp >= cp) {
            double profit = sp - cp;
            double percentage = profit / cp * 100.0;
            System.out.println("Profit: Rs " + profit);
            System.out.println("Profit Percentage: " + percentage + "%");
        } else {
            double loss = cp - sp;
            double percentage = loss / cp * 100.0;
            System.out.println("Loss: Rs " + loss);
            System.out.println("Loss Percentage: " + percentage + "%");
        }
    }
}
