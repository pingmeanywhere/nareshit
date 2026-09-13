package corejava.part2.inheritance.questions;

import java.util.Scanner;

public class AnimalSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String breed = sc.nextLine();
        int age = sc.nextInt();

        Dog a = new Dog(name, age, breed);

        a.displayDetails();
        a.eat();
        a.bark();
    }
}


class  Animal {

    public  String name;
    public  int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void displayDetails () {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

    public  void eat() {
        System.out.println("Eating food");
    }
}

class Dog extends  Animal{

    public  String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void displayDetails () {
        super.displayDetails();
        System.out.println("Breed : " + this.breed);
    }

    public void bark () {
        System.out.println("Bhau! bhau! bhau!");
    }

}

