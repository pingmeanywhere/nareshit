package corejava.part1.controlStatements.lab2;

import java.util.Scanner;

public class CubeSurfaceAreaCalculator {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();

        double area =  6 * side * side;
        System.out.println("The surface area of the cube is: " + area);
    }
}
