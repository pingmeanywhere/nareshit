package corejava.part3.lambdaExpression.lecture2;

import java.util.function.Predicate;

public class MyPredicateInterface {

    static void main(String[] args) {
        Predicate<Integer> isEven = (value) -> value % 2 == 0;
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(11)); // false
    }
}
