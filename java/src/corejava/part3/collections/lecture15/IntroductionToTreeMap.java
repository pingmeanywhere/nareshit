package corejava.part3.collections.lecture15;

import java.util.Scanner;
import java.util.TreeMap;

public class IntroductionToTreeMap {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeManager em = new EmployeeManager();

        while (true) {
            System.out.println("Enter 1 -> add, 2 -> search, 3 -> display, 4 -> total : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter id, name, salary and dept name : ");
                    em.addEmployee(new Employee(Integer.parseInt(sc.nextLine()), sc.nextLine(),
                            Double.parseDouble(sc.nextLine()), sc.nextLine()));
                }
                case 2 -> {
                    System.out.println("Enter id to search employee");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println(em.searchEmployee(id));
                }
                case 3 -> {
                    em.displayEmployees();
                }
                case 4 -> {
                    System.out.println("Total employee : " + em.getTotalEmployees());
                }
                default -> {
                    return;
                }
            }
        }

    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private String dept;

    public Employee(int id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }


    public String toString() {
        return "id : " + id + "\nname : " + name + "\nsalary : " + salary + "\ndept : " + dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}

class EmployeeManager {
    TreeMap<Integer, Employee> map;

    public EmployeeManager() {
        this.map = new TreeMap<>();
    }

    public void addEmployee(Employee e) {
        map.put(e.getId(), e);
        System.out.println("Employee " + e.getName() + " added successfully");
    }

    public Employee searchEmployee(int id) {
        if (!map.containsKey(id)) {
            System.out.println("Employee not found with id : " + id);
            return null;
        }

        System.out.println("Employee fetched successfully");
        return map.get(id);
    }

    public void displayEmployees() {
        for (Employee e : map.values()) {
            System.out.println(e);
        }
    }

    public int getTotalEmployees() {
        return map.size();
    }
}