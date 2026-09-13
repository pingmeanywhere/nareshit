package corejava.part2.methods.lecture3;

public class MethodOverloading {

    public static void run() {
        System.out.println("Someone is running...");
    }

    public static void run(String name) {
        System.out.println(name + " is running...");
    }

    static void main(String[] args) {
        run();
        run("Aquib");
    }


}
