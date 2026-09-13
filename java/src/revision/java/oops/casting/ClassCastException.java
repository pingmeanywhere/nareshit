package revision.java.oops.casting;

public class ClassCastException {

    static void main(String[] args) {
        Engine engine = new Car();
        // Bike bike = (Bike) engine; // java.lang.ClassCastException
        // safe way to cast is
        if (engine instanceof Bike) {
            Bike bike = (Bike) engine;
        }
    }
}

class Engine {

}

class Car extends Engine {

}

class Bike extends Engine {

}
