package corejava.part2.polymorphism.lab2;

import java.util.Scanner;

public class BirdFlying {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        if (choice == 1) {
            Bird bird = new Bird();
            bird.fly();
            ;
        } else if (choice == 2) {
            Parrot parrot = new Parrot();
            parrot.fly();
        } else {
            System.out.println("Invalid Choice");
        }

    }
}

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Parrot extends Bird {
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
