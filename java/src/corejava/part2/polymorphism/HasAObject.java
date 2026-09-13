package corejava.part2.polymorphism;

public class HasAObject {

    static void main(String[] args) {

        Engine engine = new Engine("Petrol", 10);

        Car car = new Car("Toyota", 190, "white", engine);

        car.display();

    }
}


class  Car {

    String company;
    int topSpeed;
    String color;
    Engine engine;


    public Car(String company, int topSpeed, String color, Engine engine) {
        this.company = company;
        this.topSpeed = topSpeed;
        this.color = color;
        this.engine = engine;
    }

    public  void display () {
        System.out.println("Company : " + this.company);
        System.out.println("Top Speed : " + this.topSpeed);
        System.out.println("Color : " + this.color);
        engine.display();
    }
}

class  Engine {
    String fuelType;
    double cc;

    public Engine(String fuelType, double cc) {
        this.fuelType = fuelType;
        this.cc = cc;
    }

    public  void display () {
        System.out.println("Fuel Type : " + this.fuelType);
        System.out.println("CC : " + this.cc);
    }
}