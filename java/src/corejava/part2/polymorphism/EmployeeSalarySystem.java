package corejava.part2.polymorphism;

public class EmployeeSalarySystem {


    static void main(String[] args) {

        SalaryCalculator sc = new SalaryCalculator();
        System.out.println(sc.calculateSalary(50000));
        System.out.println(sc.calculateSalary(20, 500));
        System.out.println(sc.calculateSalary(30000.0, 5000));

    }
}

class  SalaryCalculator {

    public double calculateSalary(double monthlySalary) {
        return monthlySalary;
    }

    public double calculateSalary(int hours, double ratePerHour) {
        return hours * ratePerHour;
    }

    public double calculateSalary(double fixedAmount, double bonus) {
        return fixedAmount + bonus;
    }
}
