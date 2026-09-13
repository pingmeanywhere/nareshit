package corejava.part2.methods;

public class Introduction {

    public static String greet() {
        return "Hello, how are you";
    }

    public  static int sum(int a, int b) {
        return  a + b;
    }

    static void main(String[] args) {
        System.out.println(greet());
        System.out.println(sum(4, 5));
    }
}
