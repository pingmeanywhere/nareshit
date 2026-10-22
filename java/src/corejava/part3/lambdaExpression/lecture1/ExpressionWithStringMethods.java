package corejava.part3.lambdaExpression.lecture1;


public class ExpressionWithStringMethods {

    static void printUpper(ReadName readName) {
        System.out.println(readName.upper());
    }

    static void main(String[] args) {

        printUpper("hello"::toUpperCase);
//        printUpper("Hello and welcome ", new Human("Aquib")::getName);
        printUpper(new Human("Aquib")::getName);

    }
}

interface ReadName {
    String upper();
}


class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    String getName(String message) {
        return message + this.name;
    }

    public String getName() {
        return "this is " + this.name;
    }
}
