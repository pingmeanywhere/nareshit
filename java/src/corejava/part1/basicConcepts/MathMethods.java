package corejava.part1.basicConcepts;

public class MathMethods {

    static void main(String[] args) {
        System.out.println(Math.min(10, 20));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.abs(-10));
        System.out.println(Math.PI);
        System.out.println(Math.round(4.5)); // 5
        System.out.println(Math.round(4.4)); // 4
        System.out.println(Math.ceil(4.1));  // 5.0
        System.out.println(Math.floor(4.9)); // 4.0
        System.out.println(Math.sqrt(9.0));  // 3.0
        System.out.println(Math.cbrt(125.0)); // 5.0
        System.out.println(Math.pow(10, 2));  // 100.0
        System.out.println(Math.powExact(10, 2));  // 100
        System.out.println(Math.random());  // any random number
    }
}
