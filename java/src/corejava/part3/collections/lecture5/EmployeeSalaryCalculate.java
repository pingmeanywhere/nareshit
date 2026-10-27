package corejava.part3.collections.lecture5;

import java.util.Scanner;
import java.util.Vector;

public class EmployeeSalaryCalculate {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        Vector<Employee> employees = new Vector<>();

        for (int i = 0; i < size; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            double salary = Double.parseDouble(sc.nextLine());

            employees.add(new Employee(id, name, salary));

        }

        for(Employee e : employees) {
            e.displayInformation();
            System.out.println();
        }

    }
}

class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;


    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary + (basicSalary * 0.1);
    }

    public void displayInformation() {
        System.out.println("ID           : " + employeeId);
        System.out.println("Name         : " + employeeName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Final Salary : " + calculateSalary());
    }
}
