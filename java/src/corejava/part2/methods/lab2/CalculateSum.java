package corejava.part2.methods.lab2;

import java.util.Scanner;

public class CalculateSum {

    public  static int calculateSum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1 here : ");
        int n1 = sc.nextInt();

        System.out.println("Enter number2 here : ");
        int n2 = sc.nextInt();

        return  n1 + n2;
    }

    static void main(String[] args) {

        /*
            8.Create a static method calculateSum()
            The method should read two numbers from the user and return their sum.
        */

        System.out.println("Sum : " + calculateSum());

    }
}
