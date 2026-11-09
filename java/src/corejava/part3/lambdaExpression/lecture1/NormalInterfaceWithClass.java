package corejava.part3.lambdaExpression.lecture1;

public class NormalInterfaceWithClass {

    static void main(String[] args) {

        Car car = new Car();
        car.startEngine();
        car.stopEngine();

    }
}

interface Engine {
    void startEngine();

    void stopEngine();
}

class Car implements Engine {
    public void startEngine() {
        System.out.println("Engine Started");
    }

    public void stopEngine() {
        System.out.println("Engine Stopped");
    }
}