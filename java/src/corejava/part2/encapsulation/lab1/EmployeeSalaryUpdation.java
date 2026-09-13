package corejava.part2.encapsulation.lab1;

import java.util.Scanner;

public class EmployeeSalaryUpdation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employeeNumber = Integer.parseInt(sc.nextLine());
        String employeeName = sc.nextLine();
        int employeeSalary = Integer.parseInt(sc.nextLine());

        int salary = Integer.parseInt(sc.nextLine());

        Employee emp = new Employee(employeeNumber, employeeName, employeeSalary);

        String designation = emp.getEmployeeDesignation(salary);

        System.out.println("Employee Number : " + emp.getEmployeeNumber());
        System.out.println("Employee Name : " + emp.getEmployeeName());
        System.out.println("Employee Salary : " + emp.getEmployeeSalary());
        System.out.println("Employee Designation  : " + designation);


    }
}


class Employee {

    private int employeeNumber;
    private String employeeName;
    private double employeeSalary;

    public Employee(int employeeNumber, String employeeName, double employeeSalary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }


    // designation
    public String getEmployeeDesignation(double salary) {

        setEmployeeSalary(salary);

        if (this.employeeSalary >= 120000) {
            return "HR Manager";
        }
        if (this.employeeSalary >= 90000) {
            return "Developer";
        }
        if (this.employeeSalary >= 60000) {
            return "Designer";
        }
        return "Tester";
    }
}