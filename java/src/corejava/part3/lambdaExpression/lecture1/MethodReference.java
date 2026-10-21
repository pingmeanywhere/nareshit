package corejava.part3.lambdaExpression.lecture1;

public class MethodReference {

    static void printSquare(int value, CustomMath op) {
        System.out.println(op.square(value));
    }

    static void main(String[] args) {

        printSquare(5, n -> n * n);
        printSquare(5, Helper::cube); // Static method reference
        printSquare(5, new Helper()::square); // Non-static method reference with object

    }
}

interface CustomMath {
    int square(int value);
}

class Helper {

    public static int cube(int value) {
        return value * value * value;
    }

    public int square(int value) {
        return value * value;
    }
}
