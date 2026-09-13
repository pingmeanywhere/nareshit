package corejava.part2.methods.constructors;

public class CopyConstructor {

    static void main(String[] args) {
        A obj1 = new A(10, 20);
        A obj2 = new A(obj1);

        System.out.println(obj2.j + " --------> " + obj2.k);
    }
}


class A {

    public  int j;
    public  int k;

    public A(int j, int k) {
        this.j = j;
        this.k = k;
    }

    public A (A obj) {
        this.j = obj.j;
        this.k = obj.k;
    }
}
