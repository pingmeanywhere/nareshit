package corejava.part3.collections.lecture16;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeePerformanceManagementSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PerformanceManager pm = new PerformanceManager();

        while (true) {
            System.out.println("Enter you choice : 1 -> add, 2 -> display, 3 -> avg performance : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter id(int), name(String), dept(String), performance(double)");
                    pm.addEmployee(new Employee(Integer.parseInt(sc.nextLine()), sc.nextLine(),
                                    sc.nextLine(), Double.parseDouble(sc.nextLine())),
                            Double.parseDouble(sc.nextLine()));
                }
                case 2 -> {
                    pm.displayEmployees();
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
    private String dept;
    private double performance;

    public Employee(int id, String name, String dept, double performance) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.performance = performance;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getPerformance() {
        return performance;
    }

    @Override
    public int compareTo(Employee o) {
        if (o.performance == this.performance) {
            return this.getId() - o.getId();
        }
        return (int) (o.getPerformance() - this.getPerformance());
    }

    @Override
    public String toString() {
        return "ID : " + id +
                "\nName" + name +
                "\nDept : " + dept +
                "\nPerformance : " + performance;
    }
}


class PerformanceManager {
    TreeMap<Employee, Double> map;

    public PerformanceManager() {
        map = new TreeMap<>();
    }

    public void addEmployee(Employee e, double bonus) {
        map.put(e, bonus);
    }

    public void displayEmployees() {

        int count = 1;
        for (Map.Entry<Employee, Double> entry : map.reversed().entrySet()) {
            System.out.println("Employee " + count + " details : ");
            System.out.println(entry.getKey());
            System.out.println("Bonus : " + entry.getValue());
        }
    }

    public void highestPerformance() {
        System.out.println("Highest Performance : " + map.firstKey());
    }

    public void lowestPerformance() {
        System.out.println("Lowest Performance : " + map.lastKey());
    }

    public void averagePerformance() {
        double sum = 0;
        for (Employee e : map.keySet()) {
            sum += e.getPerformance();
        }
        System.out.println("Avg Performance : " + sum / map.size());
    }

    public void secondHighestPerformance() {
        ArrayList<Map.Entry<Employee, Double>> al = new ArrayList<>(map.entrySet());
        System.out.println("Second Highest Performance : " + map.higherKey(map.firstKey()));
    }

    public Employee highestAnnualBonus() {
        Employee emp = null;
        double highestBonus = 0;

        for (Map.Entry<Employee, Double> entry : map.entrySet()) {
            if (entry.getValue() > highestBonus) {
                emp = entry.getKey();
                highestBonus = entry.getValue();
            }
        }
        return emp;
    }


}
