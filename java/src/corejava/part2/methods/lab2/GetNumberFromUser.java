package corejava.part2.methods.lab2;

import java.util.Scanner;

public class GetNumberFromUser {
    public  static  int getNumber () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here : ");

        int n = sc.nextInt();

        return  n;
    }

    static void main(String[] args) {

        /*
            7.Create a static method getNumber()
            The method should read a number from the user and return it.
        */

        System.out.println("Got : " + getNumber());
    }
}
