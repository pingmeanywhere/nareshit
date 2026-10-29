package corejava.part3.collections.lab3;

import java.util.Scanner;

public class IntegerCachingDemo {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer a = Integer.valueOf(sc.nextLine());
        Integer b = null;
        if (a != -256) {
            b = Integer.valueOf(sc.nextLine());
        } else {
            b = Integer.valueOf(-256);
        }

        if (a == b) {
            System.out.println("Same reference");
        } else {
            System.out.println("Different reference");
        }

    }
}
