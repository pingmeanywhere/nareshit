package corejava.part2.encapsulation.lab1;

import java.util.Scanner;

public class MessBillCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName = sc.nextLine();
        int daysPresent = Integer.parseInt(sc.nextLine());
        if (daysPresent <= 0) {
            System.out.println("Invalid Days");
            return;
        }
        int costPerDay = Integer.parseInt(sc.nextLine());

        if (costPerDay <= 0) {
            System.out.println("Invalid Cost");
            return;
        }

        MessBill mb = new MessBill(studentName, daysPresent, costPerDay);

        System.out.println("Total Bill: " + mb.calculateBill());


    }
}


class MessBill {

    private String studentName;
    private int daysPresent;
    private double costPerDay;


    public MessBill(String studentName, int daysPresent, double costPerDay) {
        this.studentName = studentName;
        this.daysPresent = daysPresent;
        this.costPerDay = costPerDay;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDaysPresent(int daysPresent) {
        this.daysPresent = daysPresent;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double calculateBill() {
        return daysPresent * costPerDay;
    }
}
