package corejava.part2.encapsulation.lab1;

import java.util.Scanner;

public class SecureAccountPIN {


    public  static  void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int currPin = sc.nextInt();
        int newPin = sc.nextInt();

        Account ac = new Account();

        ac.changePin(currPin, newPin);

    }
}


class  Account {
    private  int pin = 1234;

    public  void changePin(int currentPin, int newPin) {
        if(this.pin == currentPin) {
            this.pin = newPin;
            System.out.println("Current PIN: " + currentPin);
            System.out.println("New PIN: " + newPin);
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Incorrect current PIN. PIN change failed.");
        }
    }
}
