package corejava.part2.polymorphism.lab1;

public class CalculatorMethodOverloading {

    static void main(String[] args) {

        System.out.println("5 + 10 = " + Calculator2.add(5, 10));
        System.out.println("3.5 + 2.5 = " + Calculator2.add(3.5, 2.5));
        System.out.println("7 + 4.2 = " + Calculator2.add(7, 4.2));

    }
}

class Calculator2 {

    public static int add(int a, int b) {

        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }
}