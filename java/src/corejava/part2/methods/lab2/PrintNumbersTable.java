package corejava.part2.methods.lab2;

import java.util.Scanner;

public class PrintNumbersTable {

    public  static void printTable(int n) {
        for (int i = 1; i <=10 ; i++) {
            System.out.print((i * n) + " ");
        }
    }

    static void main(String[] args) {

        /*
            4.Create a static method printTable(int n)
            The method should take a number and print its multiplication table.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number here : ");
        int n = sc.nextInt();

        printTable(n);

    }
}
