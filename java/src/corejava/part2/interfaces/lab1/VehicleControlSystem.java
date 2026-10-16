package corejava.part2.interfaces.lab1;

import java.util.Scanner;

public class VehicleControlSystem {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        MyCar car = new MyCar(choice);
        car.drive();
    }
}


interface ManualDrive {
    void drive();
}

interface AutoDrive {
    void drive();
}

class MyCar implements ManualDrive, AutoDrive {
    int choice;

    public MyCar(int choice) {
        this.choice = choice;
    }

    public void drive() {
        if (choice == 1) {
            System.out.println("Manual Driving Mode");
        }
        else if (choice == 2) {
            System.out.println("Automatic Driving Mode");
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
