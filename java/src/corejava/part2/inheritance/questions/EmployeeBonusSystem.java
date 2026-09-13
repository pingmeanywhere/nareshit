package corejava.part2.inheritance.questions;

public class EmployeeBonusSystem {

    static void main(String[] args) {
        BonusEmployee bemp = new BonusEmployee(101, "Aquib", 30000, 1550.50);
        bemp.displayDetails();
    }
}

class  Employee {

    public  int id;
    public  String name;
    public  double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public  void displayDetails () {
        System.out.println("Product Details : ");
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }
    public double calculateSalary() {
        return salary ;
    }
}

class BonusEmployee extends Employee {

    public  double bonus;

    public BonusEmployee(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Final Salary : " + this.calculateSalary());
    }

    public double calculateSalary() {
        return salary + this.bonus;
    }

}
