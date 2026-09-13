package corejava.part2.methods.types;

public class NonStaticMethods {

    static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
    }
}

class Animal {
    public void speak() {
        System.out.println("Yes, Animal is speaking.");
    }
}
