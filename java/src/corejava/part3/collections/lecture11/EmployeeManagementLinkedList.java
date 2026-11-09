package corejava.part3.collections.lecture11;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeManagementLinkedList {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Employee> employees = new LinkedList<>();


        System.out.println("Enter the number of employees : ");
        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.println("Enter id, name and salary : ");
            employees.add(new Employee(Integer.parseInt(sc.nextLine()
            ), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        EmployeeManager employeeManager = new EmployeeManager(employees);

        employeeManager.sortEmployees();

    }
}

class Employee implements Comparable<Employee> {

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee o) {
        return (int) (this.salary - o.salary);
    }
}

class EmployeeManager {
    LinkedList<Employee> employees = null;

    public EmployeeManager(LinkedList<Employee> employees) {
        this.employees = employees;
    }

    public void sortEmployees() {
        Collections.sort(employees);

        Iterator<Employee> itr = employees.iterator();

        System.out.println("Print all employees after sorting : ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
            System.out.println();
        }
    }
}
