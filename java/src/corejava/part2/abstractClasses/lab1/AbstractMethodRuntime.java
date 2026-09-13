package corejava.part2.abstractClasses.lab1;

import java.util.Scanner;

public class AbstractMethodRuntime {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager manager = new Manager();
        Engineer engineer = new Engineer();

        int n = sc.nextInt();

        switch (n) {
            case 1 -> manager.work();
            case 2 -> engineer.work();
            default -> System.out.println("Invalid Choice. Please select 1 or 2.");
        }
    }
}

abstract class Employee {
    public abstract void work();
}

class Manager extends Employee {

    public void work() {
        System.out.println("Manager is planning and organizing tasks.");
    }
}

class Engineer extends Employee {

    public void work() {
        System.out.println("Engineer is writing code and fixing bugs.");
    }
}