package corejava.part2.polymorphism.lab2;

import java.util.Scanner;

public class PetPlayPolymorphism {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine().trim());

        if (choice == 1) {
            String name = sc.nextLine();
            Pet pet = new Dog();
            System.out.print("Dog " + name);
            pet.play();
        } else if (choice == 2) {
            String name = sc.nextLine();
            Pet pet = new Cat();
            System.out.print("Cat " + name);
            pet.play();
        } else {
            System.out.println("Invalid pet type!");
        }


    }
}

class Pet {
    public void play() {
        System.out.println("is playing");
    }
}

class Dog extends Pet {
    public void play() {
        System.out.println(" is playing fetch.");
    }
}

class Cat extends Pet {
    public void play() {
        System.out.println(" is playing with a yarn ball.");
    }
}
