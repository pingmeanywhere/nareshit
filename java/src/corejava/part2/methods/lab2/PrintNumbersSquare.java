package corejava.part2.methods.lab2;

import java.util.Scanner;

public class PrintNumbersSquare {


    public  static void printSquare(int n) {
        System.out.println("Square : " + n * n);
    }

    static void main(String[] args) {

        /*
            4.Create a static method printTable(int n)
            The method should take a number and print its multiplication table.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find square : ");
        int n = sc.nextInt();

        printSquare(n);
    }
}
