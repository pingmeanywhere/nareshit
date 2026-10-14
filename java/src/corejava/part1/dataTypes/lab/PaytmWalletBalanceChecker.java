package corejava.part1.dataTypes.lab;

public class PaytmWalletBalanceChecker {

    static void main(String[] args) {
        String userName = "Priya Jain";
        double walletBalance = 1200.0;
        double purchaseAmount = 800.0;
        boolean purchaseSuccessful = true;

        double remaining = walletBalance;
        if (purchaseSuccessful) {
            remaining = walletBalance - purchaseAmount;
        }

        System.out.println("User: " + userName + "\n" +
                "Wallet Balance: " + walletBalance + "\n" +
                "Purchase Amount: " + purchaseAmount + "\n" +
                "Purchase Successful: " + (purchaseSuccessful ? "Yes" : "No") + "\n" +
                "Remaining Balance: " + remaining);
    }
}

