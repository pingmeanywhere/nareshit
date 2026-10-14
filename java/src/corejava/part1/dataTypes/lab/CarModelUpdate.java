package corejava.part1.dataTypes.lab;

public class CarModelUpdate {

    static void main(String[] args) {

        Car car = new Car();
        System.out.println("Car Model: " + car.model);
        car.changeModel("SUV");
        System.out.println("Updated Car Model: " + car.model);

    }
}

class Car {
    String model = "Sedan";

    public void changeModel(String model) {
        this.model = model;
    }
}
