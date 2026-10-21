package corejava.part3.lambdaExpression.lecture1;

public class LambdaExpression {

    static void main(String[] args) {

        Animal dog = (String name) -> name + " is a domestic animal.";

        System.out.println(dog.describe("Puppy"));

    }
}

interface Animal {
    String describe(String name);
}
