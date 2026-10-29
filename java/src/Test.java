import java.util.Scanner;

public class Test {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(Integer.parseInt("01"));

    }
}

class A {
    private void printHi() {
        System.out.println("Hi");
    }

    public void call() {
        printHi();
    }
}

class B extends A {

    public void printHi() {
        System.out.println("HELLO");
    }

    public void call() {
        printHi();
    }
}