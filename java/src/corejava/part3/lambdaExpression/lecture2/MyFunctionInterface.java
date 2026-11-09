package corejava.part3.lambdaExpression.lecture2;

import java.util.function.Function;

public class MyFunctionInterface {

    static void main(String[] args) {
        Function<Integer, Character> transform = (value) -> (char) ((int) value);
        System.out.println(transform.apply(65)); // A
        System.out.println(transform.apply(90)); // Z
    }
}
