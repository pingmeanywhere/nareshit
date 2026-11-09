package corejava.part3.lambdaExpression.lecture2;

import java.util.function.UnaryOperator;

public class MyUnaryOperatorInterface {

    static void main(String[] args) {

        UnaryOperator<Integer> square = (value) -> value * value;

        System.out.println(square.apply(10)); // 100
        System.out.println(square.apply(5)); // 25

    }
}
