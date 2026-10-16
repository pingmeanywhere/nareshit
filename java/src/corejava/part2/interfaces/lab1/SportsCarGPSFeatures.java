package corejava.part2.interfaces.lab1;

import java.util.Scanner;

public class SportsCarGPSFeatures {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carType = sc.nextLine();

        if (carType.equals("sportscar")) {
            SportsCar sportsCar = new SportsCar();
            sportsCar.showType();
            sportsCar.showGPSFeature();
        }
        else {
            Vehicle vehicle = new Vehicle();
            vehicle.showType();
        }

    }
}

class Vehicle {
    public void showType() {
        System.out.println("Generic Vehicle");
    }
}

class Car extends Vehicle {
    public void showType() {
        System.out.println("Vehicle Type: Car");
    }
}


interface GPS {
    void showGPSFeature();
}

class SportsCar extends Car implements GPS {

    public void showGPSFeature() {
        System.out.println("SportsCar GPS Feature: Navigation, Real-Time Traffic");
    }

    public void showType() {
        System.out.println("SportsCar Type: Car ");
    }
}