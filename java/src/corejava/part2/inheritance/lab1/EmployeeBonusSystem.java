package corejava.part2.inheritance.lab1;

import java.util.EnumMap;
import java.util.Scanner;

public class EmployeeBonusSystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int salry = Integer.parseInt(sc.nextLine());

        Bonus bonus = new Bonus(name, salry);
        bonus.displayBonus();
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

class Bonus extends Employee {
    public Bonus(String name, int salary) {
        super(name, salary);
    }

    public int calculateBonus() {
        if (this.getSalary() >= 30000) {
            return (this.getSalary() * 10) / 100;
        }
        return 0;
    }

    public void displayBonus() {
        System.out.println("Bonus: " + this.calculateBonus());
    }
}
