package corejava.part3.collections.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SalaryManagementSystem {

    static int binarySearch(ArrayList<Employee> employees, int target) {
        int start = 0;
        int end = employees.size() - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (employees.get(mid).id == target) {
                return mid;
            } else if (employees.get(mid).id < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees : ");
        int size = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Employee id, name and base salary and bonus(%) :  ");
            employees.add(new PermanentEmployee(Integer.parseInt(sc.nextLine().trim()),
                    sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim()),
                    Double.parseDouble(sc.nextLine().trim())));
        }

        System.out.println("Display all employee details : ");
        for (Employee e : employees) {
            e.displayDetails();
        }
        System.out.println();

        System.out.println("Sort employees in id ascending");
        Collections.sort(employees);
        for (Employee e : employees) {
            e.displayDetails();
        }
        System.out.println();

        System.out.println("Sort employees in salary descending");
        Collections.sort(employees, new SalaryComparator());
        for (Employee e : employees) {
            e.displayDetails();
        }
        System.out.println();


        System.out.println("Enter id to search the book : ");
        int searchId = Integer.parseInt(sc.nextLine().trim());


        Collections.sort(employees);
        int index = binarySearch(employees, searchId);

        if (index == -1) {
            System.out.println("Employee not found");
        } else {
            employees.get(index).displayDetails();
        }

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double baseSalary;


    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID : " + this.id);
        System.out.println("Employee Name : " + this.name);
        System.out.println("Base Salary : " + this.baseSalary);
    }

    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}

class PermanentEmployee extends Employee {
    double bonusPercentage;


    public PermanentEmployee(int id, String name, double baseSalary, double bonusPercentage) {
        super(id, name, baseSalary);
        this.bonusPercentage = bonusPercentage;
    }

    public double calculateSalary() {
        return super.calculateSalary() + (super.calculateSalary() * bonusPercentage / 100.0);
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Final Salary : " + calculateSalary());
    }
}

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {

        if (o1.calculateSalary() == o2.calculateSalary()) {
            return o1.id - o2.id;
        }
        return (int) (o2.calculateSalary() - o1.calculateSalary());
    }
}