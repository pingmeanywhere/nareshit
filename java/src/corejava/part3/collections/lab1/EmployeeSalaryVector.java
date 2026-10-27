package corejava.part3.collections.lab1;

import java.util.Scanner;
import java.util.Vector;

public class EmployeeSalaryVector {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().trim());

        Vector<EmployeeSalary> employeeSalaries = new Vector<>(size);

        for (int i = 0; i < employeeSalaries.capacity(); i++) {
            String name = sc.nextLine();
            int salary = Integer.parseInt(sc.nextLine().trim());
            employeeSalaries.add(new EmployeeSalary(name, salary));
        }

        double totalSalary = 0;

        for (EmployeeSalary e : employeeSalaries) {
            totalSalary += e.getSalary();
        }

        double averageSalary = totalSalary / employeeSalaries.capacity();


        System.out.println("Average salary: " + averageSalary);

        System.out.println("Employees earning below average:");
        for (EmployeeSalary e : employeeSalaries) {
            if (e.getSalary() < averageSalary) {
                System.out.println(e.getName());
            }
        }

    }
}

class EmployeeSalary {
    private String name;
    private double salary;

    public EmployeeSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
