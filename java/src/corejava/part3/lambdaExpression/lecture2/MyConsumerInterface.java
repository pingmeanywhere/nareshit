package corejava.part3.lambdaExpression.lecture2;

import java.util.function.Consumer;

public class MyConsumerInterface {

    static void main(String[] args) {
        Consumer<String> work = System.out::println;
        work.accept("hello");
    }
}
