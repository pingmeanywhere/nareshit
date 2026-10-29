package corejava.part3.collections.lab3;

import java.util.Scanner;

public class UnboxingDemo {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = Integer.parseInt(sc.nextLine());

        int value = (int) n;

        System.out.println("Primitive int value: " + value);

    }
}
