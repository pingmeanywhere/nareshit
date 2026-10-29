package corejava.part3.collections.lab3;

import java.util.Scanner;

public class StockInvestorComparison {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Capital of Investor 1
//        Shares of Investor 1
//        Selling Price per Share 1
//        Capital of Investor 2
//        Shares of Investor 2
//        Selling Price per Share 2

        int capitalInvestor1 = (int) Integer.valueOf(sc.nextLine());
        int shareInvestor1 = (int) Integer.valueOf(sc.nextLine());
        int sellingPrice1 = (int) Integer.valueOf(sc.nextLine());
        int capitalInvestor2 = (int) Integer.valueOf(sc.nextLine());
        int shareInvestor2 = (int) Integer.valueOf(sc.nextLine());
        int sellingPrice2 = (int) Integer.valueOf(sc.nextLine());

        Integer investor1Total = (shareInvestor1 * sellingPrice1);
        Integer investor2Total = (shareInvestor2 * sellingPrice2);

        if (investor2Total < capitalInvestor2) {
            System.out.println("Loss Recorded for Investor 2 - No Ranking");
        } else {

        }
        if (investor1Total < capitalInvestor1) {
            System.out.println("Loss Recorded for Investor 1 - No Ranking");
        }
        if (investor1Total
                .compareTo(investor2Total) == 0) {
            System.out.println("Both Investors Ranked Equal");
        } else {
            System.out.println("Wrapped Final Payable = " + (investor2Total + capitalInvestor2));
        }
    }
}
