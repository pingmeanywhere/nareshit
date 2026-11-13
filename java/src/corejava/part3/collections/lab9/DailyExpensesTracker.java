package corejava.part3.collections.lab9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DailyExpensesTracker {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExpenseManager em = new ExpenseManager();

        int size = Integer.parseInt(sc.nextLine().trim());

        if (size > 10) {
            System.out.println("Error - Maximum 10 expenses allowed");
            return;
        }

        for (int i = 0; i < size; i++) {
            em.addExpense(Double.parseDouble(sc.nextLine()));
        }

        em.displayExpenses();

    }
}


class ExpenseManager {
    ArrayList<Double> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    void addExpense(double amount) {
        expenses.add(amount);
    }

    void displayExpenses() {
        Iterator<Double> it = expenses.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}