package corejava.part3.lambdaExpression.lecture1;

public class LambdaExpressionArgument {

    static void printSquare(int num, MathClass op) {
        System.out.println("Square : " + op.square(num));
    }

    static void main(String[] args) {
        printSquare(10, num -> num * num);

    }
}

interface MathClass {
    int square(int num);
}
