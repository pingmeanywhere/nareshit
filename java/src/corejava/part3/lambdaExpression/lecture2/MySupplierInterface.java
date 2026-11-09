package corejava.part3.lambdaExpression.lecture2;

import java.util.function.Supplier;

public class MySupplierInterface {

    static void main(String[] args) {
        Supplier<Integer> random = () -> (int) (Math.random() * 100);
        System.out.println(random.get());
    }
}
