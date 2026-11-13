package corejava.part3.collections.lab9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WeeklyExpenseTracker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int size = Integer.parseInt(sc.nextLine().trim());

        if (size > 7) {
            System.out.println("Error - Maximum 7 days allowed");
            return;
        }

        WeeklyExpenseManager wem = new WeeklyExpenseManager();

        for (int i = 0; i < size; i++) {
            ArrayList<Double> arr = new ArrayList<>();
            int total = Integer.parseInt(sc.nextLine().trim());
            for (int j = 0; j < total; j++) {
                arr.add(Double.parseDouble(sc.nextLine().trim()));
            }

            wem.addDayExpenses(arr);
        }

        wem.displayExpenses();
        System.out.println("Weekly Total: " + wem.calculateWeeklyTotal());

    }
}

class WeeklyExpenseManager {

    ArrayList<Double> dailyExpenses;
    ArrayList<ArrayList<Double>> weeklyExpenses;

    WeeklyExpenseManager() {
        this.dailyExpenses = new ArrayList<Double>();
        this.weeklyExpenses = new ArrayList<ArrayList<Double>>();
    }

    void addDayExpenses(ArrayList<Double> expenses) {
        weeklyExpenses.add(expenses);
    }

    void displayExpenses() {
        Iterator<ArrayList<Double>> nested = weeklyExpenses.iterator();
        int count = 1;
        while (nested.hasNext()) {
            Iterator<Double> i = nested.next().iterator();

            System.out.print("Day " + count + ": ");
            while (i.hasNext()) {
                double val = i.next();
                System.out.print(val + " ");
            }
            count++;
            System.out.println();
        }
    }

    double calculateWeeklyTotal() {
        Iterator<ArrayList<Double>> nested = weeklyExpenses.iterator();
        int total = 0;
        while (nested.hasNext()) {
            Iterator<Double> i = nested.next().iterator();
            while (i.hasNext()) {
                total += i.next();
            }
        }
        return total;
    }

}