package corejava.part3.lambdaExpression.lecture1;

public class LambdaExpression {

    static void main(String[] args) {


        // By this way only when the implementation is of one line only so no need to return explicitly
        // Animal dog = (String name) -> name + " is a domestic animal.";

        Animal dog = (String name) -> {
            return name + " is a domestic animal.";
        };

        System.out.println(dog.describe("Puppy"));

    }
}

interface Animal {
    String describe(String name);
}
