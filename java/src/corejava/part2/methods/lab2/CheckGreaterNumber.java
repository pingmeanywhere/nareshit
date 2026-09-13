package corejava.part2.methods.lab2;

public class CheckGreaterNumber {

    public  static  int checkGreater (int a, int b) {
        return a > b ? a : b;
    }

    static void main(String[] args) {

        /*
            3.Create a static method checkGreater(int a, int b)
            The method should take two numbers and return the greater number.
        */

        System.out.println(checkGreater(50, 15));
    }
}
