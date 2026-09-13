package corejava.part2.methods.lab2;

import java.util.Scanner;

public class CheckIfPositive {

    public  static boolean isPositive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here : ");

        int n = sc.nextInt();

        return n > 0 ? true : false;
    }


    static void main(String[] args) {

        /*
            9.Create a static method isPositive()
            The method should read a number and return true if positive, otherwise false.
        */


        System.out.println("OUTPUT : " + isPositive());


    }
}
