package corejava.part3.collections.lecture9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableClass {
    static void main(String[] args) {

        Employee emp1 = new Employee("John", 2000, 23);
        Employee emp2 = new Employee("Smash", 5000, 21);
        Employee emp3 = new Employee("Watson", 9000, 20);
        Employee emp4 = new Employee("Deno", 3000, 30);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println(employees);

        Collections.sort(employees);
        System.out.println(employees);

//        Collections.sort(employees, new MyComparator());
        Collections.sort(employees, ((o1, o2) -> (int) (o1.salary - o2.salary)));

        System.out.println(employees);

    }
}

class MyComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.age - o2.age;
    }
}

class Employee implements Comparable<Employee> {

    String name;
    double salary;
    int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int compareTo(Employee o) {
        /*
            this.[val] - o.[val] -> ascending
            o.[val] - this.[val] -> ascending
        */
        return (this.age - o.age);
    }
}
