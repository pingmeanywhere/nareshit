package corejava.part3.collections.lecture9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SalaryManagementOfEmployee {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        ArrayList<Employee01> employees = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            employees.add(new Employee01(Integer.parseInt(sc.nextLine()), sc.nextLine(),
                    Double.parseDouble(sc.nextLine())));
        }

        System.out.println("Before  :  " + employees);

        Collections.sort(employees, (a, b) -> (int) (a.salary - b.salary));
        System.out.println("After Salary sort : " + employees);

        Collections.sort(employees, (a, b) ->
                a.name.compareTo(b.name));
        System.out.println("After name sort : " + employees);
    }
}


class Employee01 {
    int employeeId;
    String name;
    double salary;


    public Employee01(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee01{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}