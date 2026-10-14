package corejava.part2.modifiers.lab;

import java.util.Scanner;

public class PetGroomingAppointmentSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String petName = sc.nextLine();
        String ownerName = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        if (age <= 0) {
            System.out.println("Error: Age must be greater than or equal to 0");
            return;
        }

        Dog dog = new Dog(petName, ownerName, age);
        dog.printPetDetails();

    }
}


class Pet {
    String petName;
    String ownerName;
    int age;

    public Pet(String petName, String ownerName, int age) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.age = age;
    }

    protected void printPetDetails() {
        System.out.println("Pet Name: " + petName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Age: " + age + " years");
    }
}

class Dog extends Pet {
    public Dog(String petName, String ownerName, int age) {
        super(petName, ownerName, age);
    }

    protected void printPetDetails() {
        super.printPetDetails();
        System.out.println("Type: Dog");
    }
}