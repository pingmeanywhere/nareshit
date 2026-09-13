package corejava.part2.abstraction;

import java.util.Scanner;

public class EmployeeBonusSystem {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        double salary = sc.nextDouble();

        Employee employee = FactoryEmployee.generatEmployee(choice);
        System.out.println("Bonus : " + employee.calculateBonus(salary));

    }
}

class FactoryEmployee {
    public static Employee generatEmployee(int choice) {
        return switch (choice) {
            case 1 -> new PermanentEmployee();
            case 2 -> new ContractEmployee();
            default -> null;
        };
    }
}

abstract class Employee {
    public abstract double calculateBonus(double salary);
}


class PermanentEmployee extends Employee {

    public double calculateBonus(double salary) {
        return salary * 0.1;
    }
}

class ContractEmployee extends Employee {

    public double calculateBonus(double salary) {
        return salary * 0.05;
    }
}
