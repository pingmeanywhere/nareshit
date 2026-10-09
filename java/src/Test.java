import java.sql.SQLException;

public class Test {

    static void main(String[] args) {
        Object o  = null;
        System.out.println(o.toString());
    }
}



class A {
    private  void printHi () {
        System.out.println("Hi");
    }

    public void call() {
        printHi();
    }
}

class  B extends  A {

    public void printHi() {
        System.out.println("HELLO");
    }

    public void call() {
        printHi();
    }
}