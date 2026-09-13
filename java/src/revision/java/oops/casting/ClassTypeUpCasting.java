package revision.java.oops.casting;

public class ClassTypeUpCasting {

    static void main(String[] args) {
        Animal animal = new Dog("Puppy", 20, "Stray", "Black");
        animal.run(); // Dog is running
        System.out.println(animal.name); // Puppy

        // animal.bark();  // no override so error in compile time

        /* Only overridden method of super class are accessible*/
    }
}


class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println("Animal is running");
    }
}

class Dog extends Animal {
    String breed;
    String color;
    String name = "DOGGY";

    public Dog(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
    }

    public void run() {
        System.out.println("Dog is running");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

