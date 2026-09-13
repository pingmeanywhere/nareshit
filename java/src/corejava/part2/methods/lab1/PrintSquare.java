package corejava.part2.methods.lab1;

public class PrintSquare {
    public  static  void printSquare () {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(Math.powExact(i, 2));
        }
    }
    static void main(String[] args) {
        printSquare();
    }
}
